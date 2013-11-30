package com.Swarm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.HackathonAndroid.R;

public class EventElementView extends LinearLayout implements View.OnClickListener {
    public EventElementView(Context context, EventElementProperty attributes) {
        super(context);
        String heading = attributes.heading;
        String subheading = attributes.subheading;
        int imgSrc = attributes.imgSrc;
        this.setOnClickListener(this);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_event_item, this, true);

        TextView headingView = (TextView) findViewById(R.id.heading);
        headingView.setText(heading);
        TextView subheadingView = (TextView) findViewById(R.id.subheading);
        subheadingView.setText(subheading);
        ImageView picView = (ImageView) findViewById(R.id.imgIcon);
        picView.setImageResource(imgSrc);
    }

    @Override
    public void onClick(View v) {

    }
}
