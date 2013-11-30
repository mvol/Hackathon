package com.Swarm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.HackathonAndroid.R;

public class EventElementView extends LinearLayout {
    public EventElementView(Context context, String heading, String subheading, int imgSrc) {
        super(context);

        setOrientation(LinearLayout.VERTICAL);
        // setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_event_item, this, true);

        TextView headingView = (TextView) findViewById(R.id.heading);
        headingView.setText(heading);
        TextView subheadingView = (TextView) findViewById(R.id.subheading);
        subheadingView.setText(subheading);
        ImageView picView = (ImageView) findViewById(R.id.imgIcon);
        picView.setImageResource(imgSrc);
    }
}
