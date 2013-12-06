package de.jssm.meetmate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.example.HackathonAndroid.R;

public class EventDetailsActivity extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_event_details);

        Intent intent = getIntent();

        String titel = intent.getStringExtra("event heading");
        String sub_heading = intent.getStringExtra("event subheading");
        int profilePic = intent.getIntExtra("profilePic", 0);

        View creatorView = new EventElementView(this, new EventElementProperty(titel, sub_heading, profilePic));

        FrameLayout creatorContainer = (FrameLayout) findViewById(R.id.fl_creator);
        creatorContainer.addView(creatorView);


        View t1View = new EventElementView(this, new EventElementProperty("Malte Vollmerhausen", "Informatik, 3. Semester", R.drawable.profil03));
        View t2View = new EventElementView(this, new EventElementProperty("Julia Hermel", "Interface Design, 4. Semester", R.drawable.profil05));

        FrameLayout t1Container = (FrameLayout) findViewById(R.id.fl_teilnehmer_1);
        FrameLayout t2Container = (FrameLayout) findViewById(R.id.fl_teilnehmer_2);

        t1Container.addView(t1View);
        t2Container.addView(t2View);

        getActionBar().setDisplayHomeAsUpEnabled(true);
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