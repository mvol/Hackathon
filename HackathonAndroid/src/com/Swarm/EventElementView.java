package com.Swarm;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.example.HackathonAndroid.R;

public class EventElementView extends LinearLayout {
    public EventElementView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.EventElementView, 0, 0);
        String heading = a.getString(R.styleable.EventElementView_heading);
        String subheading = a.getString(R.styleable.EventElementView_subheading);

    }
}
