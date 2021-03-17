package com.example.example2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    Context myContext;
    Toast myToast;
    Intent myIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myContext = getApplicationContext();
        myToast = new Toast(myContext);


        myToast.makeText(myContext, "I am a toast", Toast.LENGTH_LONG).show();

        AlertDialog.Builder dialogConf = new AlertDialog.Builder(this);
        dialogConf.setTitle("This is a neutral dialog");
        dialogConf.setMessage("This is the Text of the Neutral Dialog");
        dialogConf.setIcon(R.mipmap.ic_launcher);

        dialogConf.setNeutralButton("Dismiss",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        myToast.makeText(myContext, "You clicked Dismiss", Toast.LENGTH_LONG).show();
                    }
                });
        dialogConf.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        myToast.makeText(myContext, "You clicked Yes", Toast.LENGTH_LONG).show();
                    }
                });

        dialogConf.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        myToast.makeText(myContext, "You clicked No", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog myDialog = dialogConf.create();
        myDialog.show();

        Notification.Builder notifConf = new Notification.Builder(this);
        notifConf.setContentTitle("this is my notification");
        notifConf.setContentText("This is the detail of the notification");
        notifConf.setSmallIcon(R.mipmap.ic_launcher);

        Intent myIntent = new Intent(this, childActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(myContext,0, myIntent,0);
        notifConf.setContentIntent(contentIntent);

        NotificationManager myNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        myNotification.notify(12344544, notifConf.build());







    }
}