package com.example.tinku.intentcalculatorandcalender;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button calculatorbutton;
    Button calandarbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorbutton = findViewById(R.id.calculatorbutton);
        calculatorbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(i);
            }
        });
        calandarbutton = findViewById(R.id.calandarbutton);
        calandarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9985858585"));
                startActivity(i2);
            }
        });
    }
}
