package com.example.tinku.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Sainath on 1/31/18.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "you received an SMS", Toast.LENGTH_LONG).show();
        //on recieve method will be be triggerd when ever the event is occured.
        // for example When ever I connect my charger I can play music here. lol
        // for example if sms recieved we can make an alaram for every  2 mins.
        // for example if battery charger is connected  play some music.
        // for example if an sms is recved we can change the wallpaper.
        // for example we can start music player also.
        // we can also read message and then start playing if it has a perticular code.
        Intent i = new Intent(context,receivebroadcastandstartservice.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startService(i);
        Intent intent1 = new Intent(context,activitytostopservice.class);
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
    }
}
