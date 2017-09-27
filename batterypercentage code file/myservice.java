package com.example.r_k.intentservicebatterypercentage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.BatteryManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.NotificationCompat;

/**
 * Created by R_K on 13-08-2017.
 */

/*always be top

  .setDefaults(Notification.DEFAULT_ALL)
.setPriority(NotificationCompat.PRIORITY_MAX)

*/

public class myservice extends Service{
    NotificationCompat.Builder notificationCompat;
    NotificationManager manager;
    Bitmap bm;
    Notification notification;
    IntentFilter battchagefiter;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        bm = BitmapFactory.decodeResource(getResources(), R.drawable.battery);
        battchagefiter = new IntentFilter(intent.ACTION_BATTERY_CHANGED);
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        // register our receiver .
        this.registerReceiver(this.batterychangeReceiver, battchagefiter);
//            return super.onStartCommand(intent, flags, startId);
        return START_NOT_STICKY;

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    private myservice myservice;
    private final BroadcastReceiver batterychangeReceiver = new BroadcastReceiver(){
        @Override

        public void onReceive(Context context, Intent intent) {
            checkbatteryLevel(intent);
        }
        private void checkbatteryLevel(Intent batteryChangeIntent) {

            final int currentlevel = batteryChangeIntent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            final int maxLevel = batteryChangeIntent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

            final int percentage = (int) Math.round(currentlevel * 100.0 / maxLevel);

            switch (percentage) {
                case 1:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.one)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;

                case 2:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.two)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 3:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.three)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;

                case 4:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.four)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 5:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.five)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;

                case 6:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.six)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 7:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seven)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;

                case 8:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eight)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 9:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.nine)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;

                case 10:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ten)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 11:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eleven)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;

                case 12:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twelve)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 13:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirteen)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 14:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourteen)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 15:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is low")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fifteen)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 16:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixteen)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 17:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventeen)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 18:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eighteen)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 19:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.nineteen)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 20:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twenty)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 21:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentyone)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 22:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentytwo)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 23:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentythree)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 24:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentyfour)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 25:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentyfive)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 26:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentysix)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 27:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentyseven)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 28:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentyeight)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 29:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.twentynine)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 30:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is poor")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirty)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 31:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtyone)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 32:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtytwo)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 33:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtythree)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 34:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtyfour)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 35:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtyfive)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 36:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtysix)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 37:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtyseven)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 38:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtyeight)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 39:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.thirtynine)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 40:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourty)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 41:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtyone)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 42:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtytwo)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 43:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average").setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtythree)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 44:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtyfour)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 45:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtyfive)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 46:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtysix)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 47:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtyseven)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 48:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtyeight)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 49:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fourtynine)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 50:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fifty)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 51:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftyone)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 52:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftytwo)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 53:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftythree)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 54:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftyfour)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 55:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftyfive)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 56:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftysix)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 57:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftyseven)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 58:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftyeight)
                            .setTicker("Battery " + percentage)
                            .setLargeIcon(bm)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 59:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.fiftynine)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 60:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixty)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 61:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtyone)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 62:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtytwo)
                            .setTicker("Battery " + percentage)
                            .setLargeIcon(bm)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 63:

                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtythree)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 64:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtyfour)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 65:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtyfive)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 66:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtysix)
                            .setTicker("Battery " + percentage)
                            .setLargeIcon(bm)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 67:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtyseven)
                            .setTicker("Battery " + percentage)
                            .setLargeIcon(bm)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 68:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtyeight)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 69:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.sixtynine)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 70:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is good")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventy)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 71:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventyone)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 72:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventytwo)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 73:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventythree)
                            .setTicker("Battery " + percentage)
                            .setLargeIcon(bm)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 74:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventyfour)
                            .setLargeIcon(bm)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 75:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventyfive)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 76:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventysix)
                            .setTicker("Battery " + percentage)
                            .setLargeIcon(bm)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 77:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventyseven)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 78:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventyeight)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 79:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.seventynine)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 80:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eighty)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 81:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightyone)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 82:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightytwo)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 83:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightythree)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 84:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightyfour)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 85:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Above Average")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightyfive)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 86:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightysix)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 87:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightyseven)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 88:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightyeight)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 89:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.eightynine)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 90:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninety)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 91:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetyone)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 92:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetytwo)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 93:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetythree)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 94:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetyfour)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 95:

                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetyfive)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 96:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetysix)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 97:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetyseven)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 98:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setLargeIcon(bm)
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetyeight)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 99:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Excellent")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.ninetynine)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
                case 100:
                    notificationCompat = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                            .setContentTitle("Battery is Full")
                            .setContentText("Current percentage is " + percentage)
                            .setSmallIcon(R.drawable.houndred)
                            .setLargeIcon(bm)
                            .setTicker("Battery " + percentage)
                            .setOngoing(true);
                    manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    manager.notify(0, notificationCompat.build());
                    break;
            }

        }

    };
}