package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class History extends AppCompatActivity {
    private String date[] = new String[] {"11.12.2022","12.12.2022","13.12.2022","14.12.2022","15.12.2022","16.12.2022","17.12.2022","18.12.2022","119.12.2022","20.12.2022","21.12.2022",};
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.lv2);


        ArrayAdapter<String> datetList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,date);
        listView.setAdapter(datetList);
    }
    public void goBack(View v){

    }


}