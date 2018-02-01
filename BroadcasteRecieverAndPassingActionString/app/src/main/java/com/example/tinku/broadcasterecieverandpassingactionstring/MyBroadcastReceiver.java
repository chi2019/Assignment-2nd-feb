package com.example.tinku.broadcasterecieverandpassingactionstring;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {

        // Extract data included in the Intent

        CharSequence intentData = intent.getCharSequenceExtra("message");
        Toast.makeText(context, "broadcasteReceiver received a message : "+intentData, Toast.LENGTH_LONG).show();
    }

}