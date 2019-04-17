package com.ashay.swayambhu_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Imroz Quazi on 12-03-2018.
 */

public class CIVIL_EVENT_ADAPTER extends BaseAdapter {

    private List<Civil_Event_1> CivilEvent1List;
    private Context mcontext;

    public CIVIL_EVENT_ADAPTER(List<Civil_Event_1> CivilEvent1List, Context mcontext) {
        this.CivilEvent1List = CivilEvent1List;
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return CivilEvent1List.size();

    }

    @Override
    public Object getItem(int position)
    {
        return CivilEvent1List.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;

        if(rowView == null)
        {
            rowView = LayoutInflater.from(mcontext).inflate(R.layout.layout_item,null);

            TextView name = (TextView) rowView.findViewById(R.id.label);

            ImageView image = (ImageView) rowView.findViewById(R.id.image);


            Picasso.with(mcontext).load(CivilEvent1List.get(position).getPathofimage()).into(image);
            name.setText(CivilEvent1List.get(position).getName());
        }
        return  rowView;
    }
}

