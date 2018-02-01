package com.example.tinku.eventbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {
    private EditText resultsEditText;
    private Button lauchbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this); // This class is registerd for events but not declared what events are avaialable
        resultsEditText = findViewById(R.id.editText1);
        lauchbutton = findViewById(R.id.launch);
        lauchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ChildActivity.class);
                startActivity(i);
            }
        });
    }
    @Subscribe
    public void onEvent(CustomMessage event){
    resultsEditText.setText(event.getCustomMessage());
    }
}
