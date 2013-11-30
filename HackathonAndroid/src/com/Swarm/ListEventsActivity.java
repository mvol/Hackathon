package com.Swarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.HackathonAndroid.R;
import de.hdm.jsse.JSSEProtocol;
import de.hdm.jsse.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class ListEventsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Intent intent = getIntent();
        String username = intent.getStringExtra(LoginActivity.USERNAME);
        String password = intent.getStringExtra(LoginActivity.PASSWORD);

        Map<String,Object> parameters = new HashMap<String, Object>();
        parameters.put("username", username);
        parameters.put("password", password);

        new Request(JSSEProtocol.ACTION_LOGIN, parameters);
    }
}