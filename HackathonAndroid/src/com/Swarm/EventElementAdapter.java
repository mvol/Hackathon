package com.Swarm;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.HackathonAndroid.R;

public class EventElementAdapter extends ArrayAdapter<EventElement> {
    Context context;
    int layoutResourceId;
    EventElement[] data = null;

    public EventElementAdapter(Context context, int layoutResourceId, EventElement[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        EventElementHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new EventElementHolder();
            holder.imgIcon = (ImageView) row.findViewById(R.id.imgIcon);
            holder.heading = (TextView) row.findViewById(R.id.heading);
            holder.subheading = (TextView) row.findViewById(R.id.subheading);
            row.setTag(holder);
        } else {
            holder = (EventElementHolder) row.getTag();
        }

        EventElement element = data[position];
        holder.heading.setText(element.heading);
        holder.subheading.setText(element.subheading);
        holder.imgIcon.setImageResource(element.picture);

        return row;
    }

    static class EventElementHolder {
        ImageView imgIcon;
        TextView heading;
        TextView subheading;
    }
}
