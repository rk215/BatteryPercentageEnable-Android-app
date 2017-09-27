package com.example.r_k.intentservicebatterypercentage;

import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{
    private myservice service;
    Switch Batteryswitch;
    Intent intent;
    NotificationCompat.Builder notificationCompat;
    NotificationManager manager;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Batteryswitch = (Switch) findViewById(R.id.Batteryswitch);

        preferences = getSharedPreferences("myPreference", MODE_PRIVATE);
        Batteryswitch.setChecked
                (preferences.getBoolean("Switch", false));


        Batteryswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (Batteryswitch.isChecked() == true) {
                    if (service == null) {
                        intent = new Intent(MainActivity.this, myservice.class);

     preferences = getSharedPreferences("myPreference", MODE_PRIVATE);

     editor = preferences.edit();

     editor.putBoolean("Switch", true);

     editor.commit();
                        startService(intent);
                    }
                } else {
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
