package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Button btn_settings;
    private FrameLayout frameLayout;
    private Settings settings = new Settings();
    int progress = 0;
    ProgressBar pb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn_settings = findViewById(R.id.btn_settings);
         frameLayout = findViewById(R.id.frame_layout);
         pb=findViewById(R.id.pb);


        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewFragment(settings);
            }
        });

    }

    private void setNewFragment(Fragment  fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout,settings);
        ft.commit();
    }

    public void goHistory (View v) {
        Intent intent = new Intent(this,History.class);
        startActivity(intent);
    }
    public void goProduct (View v) {
        Intent intent = new Intent(this,Product.class);
        startActivity(intent);
    }

    public void setProgressvalue(int progress){

    }
        public void click (View view){
        pb.setProgress(50);
        }
}

