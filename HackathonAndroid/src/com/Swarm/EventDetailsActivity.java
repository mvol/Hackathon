package com.Swarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.example.HackathonAndroid.R;

public class EventDetailsActivity extends Activity {
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

        View t1View = new EventElementView(this, new EventElementProperty(titel, sub_heading, R.drawable.profil03));
        View t2View = new EventElementView(this, new EventElementProperty(titel, sub_heading, R.drawable.profil05));

        FrameLayout t1Container = (FrameLayout) findViewById(R.id.fl_teilnehmer_1);
        FrameLayout t2Container = (FrameLayout) findViewById(R.id.fl_teilnehmer_2);

        t1Container.addView(t1View);
        t2Container.addView(t2View);
    }
}