package com.example.daplicaionesmovils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    String anyString;
    TextView myTextViewMgr;
    Intent intentReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2);

        myTextViewMgr = findViewById(R.id.textView);
        intentReceiver = getIntent();
        myTextViewMgr.setText(intentReceiver.getStringExtra("myExtra"));

    }
}