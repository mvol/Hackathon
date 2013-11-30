package com.Swarm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.HackathonAndroid.R;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 13:45
 * To change this template use File | Settings | File Templates.
 */
public class TestActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.test_layout);

        TextView tv = (TextView) findViewById(R.id.textView);

        tv.setText("Hello World!");



    }
}