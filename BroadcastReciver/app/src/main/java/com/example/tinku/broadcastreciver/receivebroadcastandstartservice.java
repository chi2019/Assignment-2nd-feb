package com.example.tinku.broadcastreciver;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class receivebroadcastandstartservice extends Service {


    MediaPlayer mp;

    public void onCreate() {
        Toast.makeText(this, "The service started", Toast.LENGTH_SHORT).show();
        mp= MediaPlayer.create(receivebroadcastandstartservice.this,R.raw.kali);
        mp.start();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }

}

