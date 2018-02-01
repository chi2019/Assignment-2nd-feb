package com.example.tinku.b11alaram;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.content.Context.*;

public class MainActivity extends AppCompatActivity {

    EditText timeEditText;
    Button setButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeEditText = findViewById(R.id.editText);
        setButton = findViewById(R.id.button);

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int time = Integer.parseInt(timeEditText.getText().toString());
                setButton.setEnabled(false);
                Intent i = new Intent(MainActivity.this,SecondAct.class);
                PendingIntent pi = PendingIntent.getActivity(MainActivity.this,123,i,0);
                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(time*1000),pi);
            }
        });


    }
}
