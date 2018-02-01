package com.example.tinku.colors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button yellowbutton;
    Button greenbutton;
    Button redbutton;
    RelativeLayout mainlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yellowbutton = findViewById(R.id.yellowbutton);
        redbutton = findViewById(R.id.redbutton);
        greenbutton = findViewById(R.id.greenbutton);
        mainlayout = findViewById(R.id.mainlayout);
        Log.i("mylog","activity oncreate started");

        yellowbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainlayout.setBackgroundColor(Color.YELLOW);
                yellowbutton.setEnabled(false);
                redbutton.setEnabled(true);
                greenbutton.setEnabled(true);
            }
        });
        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainlayout.setBackgroundColor(Color.RED);
                yellowbutton.setEnabled(true);
                redbutton.setEnabled(false);
                greenbutton.setEnabled(true);
            }
        });
        greenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainlayout.setBackgroundColor(Color.GREEN);
                yellowbutton.setEnabled(true);
                redbutton.setEnabled(true);
                greenbutton.setEnabled(false);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mylog","activity started");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mylog","activity paused");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mylog","activity resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mylog","activity stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("mylog","activity restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mylog","activity destroid");
    }
}
