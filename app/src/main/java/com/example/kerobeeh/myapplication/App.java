package com.example.kerobeeh.myapplication;

import android.app.Application;
import android.widget.Toast;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;
/**
 * Created by kero beeh on 10/16/2017.
 */

public class App extends Application {



        @Override
        public void onCreate() {
            super.onCreate();
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.DEBUG, OneSignal.LOG_LEVEL.DEBUG);
            OneSignal.startInit(this)
                    .setNotificationOpenedHandler(new OneSignal.NotificationOpenedHandler() {
                        @Override
                        public void notificationOpened(OSNotificationOpenResult result) {
                            Toast.makeText(App.this, "sjdfnwejvfngewfn", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                    .unsubscribeWhenNotificationsAreDisabled(true)
                    .init();
        }
    }

