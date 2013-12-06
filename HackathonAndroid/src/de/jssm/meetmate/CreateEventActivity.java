package de.jssm.meetmate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.example.HackathonAndroid.R;

/**
 * Created with IntelliJ IDEA.
 * User: malte_000
 * Date: 30.11.13
 * Time: 18:00
 * To change this template use File | Settings | File Templates.
 */
public class CreateEventActivity extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_event_activity);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        Button b_create = (Button)findViewById(R.id.b_create);

        b_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TitleActivity.class);

                intent.putExtra(ListEventsActivity.INTENT_ACTION, ListEventsActivity.INTENT_ACTION_CREATE);

                startActivity(intent);
            }
        }
        );



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // MenuInflater inflater = getMenuInflater();
        // inflater.inflate(R.menu.menu_action, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}