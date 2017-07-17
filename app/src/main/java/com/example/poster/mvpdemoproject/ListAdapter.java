package com.example.poster.mvpdemoproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by POSTER on 12.07.2017.
 */

public class ListAdapter extends BaseAdapter {
    private List<String> list = new ArrayList<>();
    private Context context;

    public ListAdapter(Context context) {
        this.context = context;
        for (int i = 0; i < 90; i++) {
            list.add("Item " + i);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, null);
        TextView textView = (TextView) convertView.findViewById(android.R.id.text1);
        textView.setText(list.get(position));

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (context instanceof MainActivity){
                    //((MainActivity)context).getPresenter().buttonPress(list.get(position));
                    ((MainActivity)context).getPresenter().shutLoadTextInView(list.get(position), context);
                }
            }
        });
        return convertView;
    }
}
