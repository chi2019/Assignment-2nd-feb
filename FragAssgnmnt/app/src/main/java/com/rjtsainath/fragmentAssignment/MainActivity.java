package com.rjtsainath.fragmentAssignment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*
* created an object of Fragmentone and used replaced the main layout with fragmentone using begin transaction
* in fragment Manager
* getSupportFragmentManager() is the method used to get support from fragment manager.
*
* */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentOne fragmentOne = new FragmentOne();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.mainLayout,fragmentOne).commit();


    }
}
