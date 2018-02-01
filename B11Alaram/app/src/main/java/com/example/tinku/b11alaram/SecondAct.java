package com.example.tinku.b11alaram;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondAct extends AppCompatActivity {
    MediaPlayer mp;
    Button stop;
    Button snooze;
    Button snooze10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mp= MediaPlayer.create(SecondAct.this,R.raw.sampleaudio);
        mp.start();
        stop = findViewById(R.id.stop);
        snooze = findViewById(R.id.button3);
        snooze10 = findViewById(R.id.button2);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mp.stop();
            }
        });
        snooze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.stop();
                    Intent i = new Intent(SecondAct.this,SecondAct.class);
                    PendingIntent pi = PendingIntent.getActivity(SecondAct.this,123,i,0);
                    AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                    alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(5000),pi);
                }

            }
        });
        snooze10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                Intent i = new Intent(SecondAct.this,SecondAct.class);
                PendingIntent pi = PendingIntent.getActivity(SecondAct.this,123,i,0);
                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(10000),pi);
            }
        });

    }





}
