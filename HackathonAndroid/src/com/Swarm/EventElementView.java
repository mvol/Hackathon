package com.Swarm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.HackathonAndroid.R;

public class EventElementView extends LinearLayout implements View.OnClickListener {
    String heading;
    String subheading;
    int imgSrc;

    public EventElementView(Context context, EventElementProperty attributes) {
        super(context);
        this.heading = attributes.heading;
        this.subheading = attributes.subheading;
        this.imgSrc = attributes.imgSrc;
        this.setOnClickListener(this);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_event_item, this, true);

        TextView headingView = (TextView) findViewById(R.id.heading);
        headingView.setText(heading);
        TextView subheadingView = (TextView) findViewById(R.id.subheading);
        subheadingView.setText(subheading);
        ImageView picView = (ImageView) findViewById(R.id.imgIcon);
        picView.setImageResource(imgSrc);
        Typeface tf = Typeface.create("Roboto-Regular", Typeface.NORMAL);
        headingView.setTypeface(tf);

        this.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // Toast.makeText(v.getContext().getApplicationContext(), "focus!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), EventDetailsActivity.class);
        intent.putExtra("event heading", heading);
        intent.putExtra("event subheading", subheading);
        intent.putExtra("profilePic", imgSrc);
        v.getContext().startActivity(intent);
    }
}
