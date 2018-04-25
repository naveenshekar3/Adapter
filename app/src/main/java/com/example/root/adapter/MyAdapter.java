package com.example.root.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter{

    private Context mContext;
    private ArrayList<String> cityList;
    private LayoutInflater mLayoutInflater;

    public MyAdapter(Context mContext, ArrayList<String> cityList) {
        this.mContext = mContext;
        this.cityList = cityList;
        mLayoutInflater=LayoutInflater.from(mContext);
    }

    public void setCityList(ArrayList<String> cityList) {
        this.cityList = cityList;
    }

    //below method will return number of items we have used in the listview.
    //we have to set the size of the arraylist.
    @Override
    public int getCount() {
        return cityList.size();
    }

    //
    @Override
    public Object getItem(int position) {
        return null;
    }

    //each item has its own id
    @Override
    public long getItemId(int position) {
        return 0;
    }


    //how to design the view.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null)
        {
            convertView=mLayoutInflater.inflate(R.layout.item_layout,parent,false);
        }
        TextView cityNameTv = (TextView) convertView.findViewById(R.id.city_tv);
        cityNameTv.setText(cityList.get(position));
        Log.i("MyAdapter", "getView: "+position);
        return convertView;
    }
}
