package com.Swarm;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.HackathonAndroid.R;

import java.util.ArrayList;

public class TitleActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ArrayList<EventElementProperty> eventData = new ArrayList<EventElementProperty>();
        for (int i = 0; i < 6; i++) {
            eventData.add(new EventElementProperty("", "", 0));
        }

        int[] images = new int[]{R.drawable.profil01, R.drawable.profil02, R.drawable.profil03,
                R.drawable.profil04, R.drawable.profil05};
        String[] titles = new String[]{"Mathe II Integrale", "Elektronik Wiederholung",
                "Informatik-Codemarathon", "Medienrecht-Lerntreffen", "Physik Nachhilfe"};
        String[] subtitles = new String[]{"13.12, 13:00, Bibliothek", "Samstag, 14:00, Raum 120",
                "01.01., 12:00, PC-Pool", "06.12., 16:00, Unithekle", "Sonntag, 14:00, Raum P02"};

        for (int i = 0; i < images.length; i++) {
            eventData.get(i).imgSrc = images[i];
            eventData.get(i).heading = titles[i];
            eventData.get(i).subheading = subtitles[i];
        }

        ArrayList<EventElementView> eventViews = new ArrayList<EventElementView>();
        for (int i = 0; i < eventData.size(); i++) {
            eventViews.add(new EventElementView(this, eventData.get(i)));
        }

        LinearLayout l = (LinearLayout) findViewById(R.id.courseList);
        LinearLayout l2 = (LinearLayout) findViewById(R.id.miscList);
        TextView section1 = (TextView) findViewById(R.id.courseHeading);
        section1.setBackgroundResource(R.drawable.title_bg);
        TextView section2 = (TextView) findViewById(R.id.miscHeading);
        section2.setBackgroundResource(R.drawable.title_bg);       ;

        Typeface tf = Typeface.create("Roboto-Regular", Typeface.BOLD);
        section1.setTypeface(tf);
        section2.setTypeface(tf);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.FILL_PARENT);

        for (EventElementView eventView : eventViews) {
            l.addView(eventView, params);
        }

        l2.addView(new EventElementView(this,
                new EventElementProperty("Photowalk", "13.1., 13:00, Rotebühlplatz", R.drawable.profil01)), params);
        l2.addView(new EventElementView(this,
                new EventElementProperty("Nachtspaziergang", "Samstag, 00:00, Allmandring 43", R.drawable.profil04)), params);
        l2.addView(new EventElementView(this,
                new EventElementProperty("Film schauen im Metropol", "3.12.., 19:00, Metropol Kino", R.drawable.profil03)), params);    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_action, menu);
        return super.onCreateOptionsMenu(menu);
    }
}





















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































