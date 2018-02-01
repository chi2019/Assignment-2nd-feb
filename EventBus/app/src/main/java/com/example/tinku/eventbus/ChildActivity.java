package com.example.tinku.eventbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

public class ChildActivity extends AppCompatActivity {
    Button triggerevent;
    EditText messageEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        messageEditText = findViewById(R.id.editText);
        triggerevent = findViewById(R.id.button);
        triggerevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userText = messageEditText.getText().toString();

                CustomMessage event = new CustomMessage();
                event.setCustomMessage(userText);
                EventBus.getDefault().post(event);
                finish();
            }
        });
    }
}
