package com.Swarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.example.HackathonAndroid.R;
import de.hdm.jsse.JSSEProtocol;
import de.hdm.jsse.TransferContainer;

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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        Intent intent = getIntent();
        String username = intent.getStringExtra(LoginActivity.USERNAME);
        String password = intent.getStringExtra(LoginActivity.PASSWORD);

        Map<String,Object> parameters = new HashMap<String, Object>();
        parameters.put("username", username);
        parameters.put("password", password);

        TransferContainer tc = new TransferContainer(JSSEProtocol.ACTION_LOGIN, parameters);
        RequestTask rt = new RequestTask(tc, this);

        rt.execute("10.60.37.27","8080");
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