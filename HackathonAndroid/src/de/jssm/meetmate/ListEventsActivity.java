package de.jssm.meetmate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.example.HackathonAndroid.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class ListEventsActivity extends Activity implements ResponseHandler {
    public static final String INTENT_ACTION = "intent_action";
    public static final int INTENT_ACTION_LOGIN = 0;
    public static final int INTENT_ACTION_CREATE = 1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);


        Intent intent = getIntent();

        switch(intent.getIntExtra(INTENT_ACTION, 0)){

            case INTENT_ACTION_LOGIN:
                String username = intent.getStringExtra(LoginActivity.USERNAME);
                String password = intent.getStringExtra(LoginActivity.PASSWORD);


                Map<String,Object> parameters1 = new HashMap<String, Object>();
                parameters1.put("username", username);
                parameters1.put("password", password);

                TransferContainer tc1 = new TransferContainer(JSSEProtocol.ACTION_LOGIN, parameters1);
                RequestTask rt = new RequestTask(tc1, this);

                rt.execute("10.60.37.27","8080");
                break;

            case INTENT_ACTION_CREATE:
                Map<String,Object> parameters2 = new HashMap<String, Object>();
                TransferContainer tc2 = new TransferContainer(JSSEProtocol.ACTION_LOGIN, parameters2);

                break;

        }

    }

    @Override
    public void onSuccess(TransferContainer tc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onError(String errorMsg) {
        System.out.println("SERVER ERROR: "+errorMsg);
    }

    @Override
    public void onSuccess(String result) {
        System.out.println("SERVER RESPONDED WITH: ");

        Toast.makeText(getApplicationContext(), "SERVER RESPONDED with: "+result, Toast.LENGTH_LONG).show();
        this.setContentView(R.layout.main);
    }
}