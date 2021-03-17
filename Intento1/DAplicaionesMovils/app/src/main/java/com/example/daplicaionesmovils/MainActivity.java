package com.example.daplicaionesmovils;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button buttonManager;
    TextView txtViewManager;
    ImageView imgViewManager;
    Intent myIntent;
    Context myContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonManager = findViewById(R.id.button);
        txtViewManager = findViewById(R.id.textView);
        imgViewManager = findViewById(R.id.imageView5);

        buttonManager.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                txtViewManager.setText("You have clicked me");
                if(imgViewManager.getVisibility() == View.VISIBLE){
                    imgViewManager.setVisibility(View.INVISIBLE);
                }else {
                    imgViewManager.setVisibility(View.VISIBLE);
                    txtViewManager.setText("My second App");
                }
                myIntent = new Intent(myContext, ChildActivity.class);
                myIntent.putExtra("myExtra", txtViewManager.getText().toString());

                startActivity(myIntent);

            }
        });


    }
}