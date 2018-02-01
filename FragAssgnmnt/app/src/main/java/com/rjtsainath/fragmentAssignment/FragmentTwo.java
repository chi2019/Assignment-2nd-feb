package com.rjtsainath.fragmentAssignment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/*
* Java class of fragment2 for description.
* has onCreate method which inflates this layout in main activity.
* Bundle is a method to desplay arguments passes
* */

public class FragmentTwo extends Fragment {

    public FragmentTwo(){

    }



TextView display;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two,container,false);

        display = v.findViewById(R.id.displayTextView);

        Bundle bundle = getArguments();

        if(bundle!=null){
             if(bundle.getString("description")!=null){
                 display.setText(bundle.getString("description"));
             }
        }

        return v;
    }
}
