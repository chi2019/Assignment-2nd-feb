package com.example.tinku.b11services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by ryellap on 1/26/18.
 */

public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("myintentservice");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "This is service created from thread", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            Toast.makeText(this, "This is Handle Intent running from thread", Toast.LENGTH_SHORT).show();
        }// Even finally block will not be visible in UI because its a sub thread of main thread. Only main thread will show the
        //result or console output.

    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Toast.makeText(this, "This is service started toast from thread", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "This is service Destroyed toast from thread", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
