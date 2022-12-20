package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Product extends AppCompatActivity {
    private String[] array = new String[] {"Gosha","Ananas","Cow"};
    private ListView listView;

    public void goBack (View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_product);
        listView = findViewById(R.id.lv);


        ArrayAdapter<String> productList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
        listView.setAdapter(productList);

    }







}