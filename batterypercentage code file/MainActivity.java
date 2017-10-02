package com.example.r_k.intentservicebatterypercentage;

import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{
    myservice service;
    Switch Batteryswitch;
    Intent intent;
    NotificationCompat.Builder notificationCompat;
    NotificationManager manager;

    Toolbar toolbar;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add toolbar and find id.
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        //set toolbar title as our app name.
        toolbar.setTitle(getResources().getString(R.string.app_name));
        //set toolbar title text color as 'white'.
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        //find switch(android view/control) id.
        Batteryswitch = (Switch) findViewById(R.id.Batteryswitch);
        //check the current switch state (enable/disable).
        preferences = getSharedPreferences("myPreference", MODE_PRIVATE);
        //set the sharedPreference current state to switch. by default must be false.because switch by default is turn off you have to turn on.
        Batteryswitch.setChecked
                (preferences.getBoolean("Switch", false));


        Batteryswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //check if the switch is checked or not.
                if (Batteryswitch.isChecked() == true) {
                    //switch is checked.
                    //check service is null or not.
                    if (service==null) {
                        //start the service here
                        intent = new Intent(MainActivity.this, myservice.class);
                        //set the current switch state to sharedPreference.
                        preferences = getSharedPreferences("myPreference", MODE_PRIVATE);
                        editor = preferences.edit();

                        editor.putBoolean("Switch", true);

                        editor.commit();
                        startService(intent);
                    }
                } else {
                    //means service running so stop all over features.
                    //set the current switch state to sharedPreference.
                    editor = preferences.edit();
                    editor.putBoolean("Switch", false);
                    editor.apply();

                    intent = new Intent(MainActivity.this, myservice.class);
                    stopService(intent);//stop service.

                    //cancel notification from status bar .
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is ")
                            .setSmallIcon(R.drawable.one)
                            .setTicker("Battery ");
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.cancel(0);

                }
            }
        });

    }

}
