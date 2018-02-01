package com.example.tinku.firstassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button next;
    EditText editTextuserID;
    EditText editpassword;
    RadioGroup rg;
    RadioButton rbmale;
    RadioButton rbfemale;
    CheckBox car;
    CheckBox bike;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextuserID =findViewById(R.id.editTextUserID);
        editpassword = findViewById(R.id.editTextPassword);
        rbmale= findViewById(R.id.Male);
        rbfemale=findViewById(R.id.Female);
        car = findViewById(R.id.checkBox);
        bike = findViewById(R.id.checkBox2);
        String edittextuserid = editTextuserID.getText().toString();

        next = (Button)findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("Name", editTextuserID.getText().toString());
                i.putExtra("Pass",editpassword.getText().toString());
                i.putExtra("car",car.getText().toString());
                i.putExtra("bike",bike.getText().toString());

                startActivity(i);
            }
        });

    }

}
