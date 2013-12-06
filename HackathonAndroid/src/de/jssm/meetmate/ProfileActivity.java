package de.jssm.meetmate;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import com.example.HackathonAndroid.R;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 01.12.13
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
public class ProfileActivity extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // MenuInflater inflater = getMenuInflater();
        // inflater.inflate(R.menu.menu_action, menu);
        return super.onCreateOptionsMenu(menu);
    }
}