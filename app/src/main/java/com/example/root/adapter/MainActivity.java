package com.example.root.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView mListView;
    private MyAdapter mMyAdapter;
    private ArrayList<String> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView=(ListView)findViewById(R.id.listview);
        
        cityList=new ArrayList<>();

        cityList.add("Banglore");
        cityList.add("Delhi");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Kolkata");
        cityList.add("Banglore");
        cityList.add("Delhi");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Kolkata");cityList.add("Banglore");
        cityList.add("Delhi");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Kolkata");cityList.add("Banglore");
        cityList.add("Delhi");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Kolkata");cityList.add("Banglore");
        cityList.add("Delhi");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Kolkata");cityList.add("Banglore");
        cityList.add("Delhi");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Kolkata");

        mMyAdapter=new MyAdapter(MainActivity.this,cityList);
        mListView.setAdapter(mMyAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                cityList.remove(position);
                mMyAdapter.setCityList(cityList);
                mMyAdapter.notifyDataSetChanged();
            }
        });
    }

    public void addAnimals(View view) {
        cityList.add("Tiger");
        cityList.add("Lion");
        cityList.add("Cat");
        cityList.add("Dog");
        cityList.add("Elephant");
        mMyAdapter.setCityList(cityList);
        mMyAdapter.notifyDataSetChanged();
    }
}
