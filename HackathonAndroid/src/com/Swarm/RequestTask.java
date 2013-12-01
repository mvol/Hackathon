package com.Swarm;

import android.os.AsyncTask;
import com.google.gson.Gson;
import de.hdm.jsse.TransferContainer;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 23:13
 * To change this template use File | Settings | File Templates.
 */
public class RequestTask extends AsyncTask<String, String, String> {

    private final TransferContainer transferContainer;
    private final ResponseHandler responseHandler;
    private String responseString;

    public RequestTask(TransferContainer tc, ResponseHandler rh){
        this.transferContainer = tc;
        this.responseHandler = rh;
    }

    @Override
    protected String doInBackground(String... params){
        HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response;
        String responseString = null;
        String requestString = null;

        Gson gson = new Gson();
        requestString = gson.toJson(transferContainer);

        try {
            URI address = new URI("http", null, params[0], Integer.parseInt(params[1]), "/", "", "");
            HttpPost post = new HttpPost(address);

            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add(new BasicNameValuePair("content", requestString));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            response = httpclient.execute(post);
            StatusLine statusLine = response.getStatusLine();
            if(statusLine.getStatusCode() == HttpStatus.SC_OK){
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                response.getEntity().writeTo(out);
                out.close();
                responseString = out.toString();
                this.responseString = responseString;
            } else{
                //Closes the connection.
                response.getEntity().getContent().close();
                throw new IOException(statusLine.getReasonPhrase());
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return responseString;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        this.responseHandler.onSuccess( result );
    }
}

class RequestTaskParamters{
    String url;
    TransferContainer tc;

    public RequestTaskParamters(String url, TransferContainer tc){
        this.url = url;
        this.tc = tc;
    }
}