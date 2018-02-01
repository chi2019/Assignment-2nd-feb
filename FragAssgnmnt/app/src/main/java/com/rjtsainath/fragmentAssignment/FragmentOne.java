package com.rjtsainath.fragmentAssignment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
/*
* List of countries are displayed in this fragment One class.
* methods for the countries selected from list are displayed and result is displayed in Fragment2 Layout
* Array Adapter provides the details of the items that are there in the list
* Fragment Manager and Fragment Transaction are the methods to transact and manage the data obtained from other Fragments.
* */


public class FragmentOne extends Fragment {


    public FragmentOne(){

    }

    ArrayList<String> countries;
    String description;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
                View v = inflater.inflate(R.layout.fragment_one,container,false);

             countries =  new ArrayList<>();
             countries.add("India");
             countries.add("China");
             countries.add("Japan");
             countries.add("Russia");
             countries.add("Afghanistan");
             countries.add("Iran");
             countries.add("America");
             countries.add("London");
             countries.add("Switzerland");
             countries.add("Thailand");
            countries.add("India");
            countries.add("China");
             countries.add("Japan");
            countries.add("Russia");
             countries.add("Afghanistan");
              countries.add("Iran");
              countries.add("America");
                countries.add("London");
                  countries.add("Switzerland");
                  countries.add("Thailand");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                countries);

        ListView lvData  =  v.findViewById(R.id.lvData);
             lvData.setAdapter(adapter);

             lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                 @Override
                 public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                     String countryName = countries.get(i);
                     description = getString(getStringId(countryName));
                     FragmentTwo fragmentTwo = new FragmentTwo();

                     Bundle bundle = new Bundle();
                     bundle.putString("description",description);
                     fragmentTwo.setArguments(bundle);
                     FragmentManager manager  =  getFragmentManager();
                     manager.beginTransaction().replace(R.id.mainLayout,fragmentTwo).commit();
                 }
             });
        return v;
    }

    private int getStringId(String countryName) {

        if(countryName.equals("India")){
            return R.string.India;
        }else if(countryName.equals("China")){
            return R.string.China;
        }else if(countryName.equals("Japan")){
            return R.string.Japan;
        }else if(countryName.equals("Russia")){
            return R.string.Russia;
        }else if(countryName.equals("Afghanistan")){
            return R.string.Afghanistan;
        }else if(countryName.equals("Iran")){
            return R.string.Iran;
        }else if(countryName.equals("America")){
            return R.string.America;
        }
        else if(countryName.equals("Switzerland")){
            return R.string.Switzerland;
        }
        else if(countryName.equals("Thailand")){
                    return R.string.Thailand;
        }else if (countryName.equals("London")){
            return R.string.London;
        }
        else {
            return R.string.India;
        }
    }


}
