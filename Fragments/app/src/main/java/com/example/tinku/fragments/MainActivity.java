package com.example.tinku.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonfrag1;
    Button buttonfrag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonfrag1= findViewById(R.id.button);
        buttonfrag2 = findViewById(R.id.button2);

        buttonfrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentOne fragmentOne = new FragmentOne();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentdefault,fragmentOne);
                fragmentTransaction.commit();
            }
        });
        buttonfrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTwo fragmentTwo = new fragmentTwo();
                FragmentManager fragmentManager =  getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragmentdefault, fragmentTwo);
                ft.commit();

            }
        });
    }
}
