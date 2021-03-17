package com.example.example2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import android.os.Bundle;

public class childActivity extends AppCompatActivity {

    Context myContext;
    Toast myToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myContext = getApplicationContext();
        myToast = new Toast(myContext);

        myToast.makeText(myContext, "I am a toast", Toast.LENGTH_LONG).show();

    }
}