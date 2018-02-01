package com.example.tinku.firstassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = findViewById(R.id.textView4);

        String str = getIntent().getExtras().getString("Name");
        String str1 = getIntent().getExtras().getString("Pass");
        String str2 = getIntent().getExtras().getString("Radio");
        String str3 = getIntent().getExtras().getString("car");
        String str4 = getIntent().getExtras().getString("bike");
        text.setText(str+"\n"+str1+"\n"+str2+"\n"+str3+"\n"+str4);
    }
}
