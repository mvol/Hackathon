package com.Swarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.HackathonAndroid.R;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 */
public class LoginActivity extends Activity {
    public final static String USERNAME = "com.Swarm.USERNAME";
    public final static String PASSWORD = "com.Swarm.PASSWORD";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_activity);

        final EditText et_username = (EditText) findViewById(R.id.et_username);
        final EditText et_password = (EditText) findViewById(R.id.et_password);

        Button b_login = (Button)findViewById(R.id.b_login);
        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(et_username.getText().toString(), et_password.getText().toString());
            }
        });

    }


    public void login(String username, String password){
        Intent intent = new Intent(this, TitleActivity.class);
        intent.putExtra(TitleActivity.INTENT_ACTION, TitleActivity.INTENT_ACTION_LOGIN);
        intent.putExtra(USERNAME, username);
        intent.putExtra(PASSWORD, password);
        startActivity(intent);
    }
}