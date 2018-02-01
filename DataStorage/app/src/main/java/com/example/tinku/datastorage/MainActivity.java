package com.example.tinku.datastorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText edittext;
    EditText password;
    CheckBox remember;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = findViewById(R.id.editTextpassword);
        remember = findViewById(R.id.checkbox);
        sp = getSharedPreferences("myfile", Context.MODE_PRIVATE);

        button = findViewById(R.id.loginbutton);
        edittext = findViewById(R.id.editTextuserid);

            edittext.setText(sp.getString("user", "Enter User Name"));
            password.setText(sp.getString("password", ""));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(remember.isChecked()) {
                    String username = edittext.getText().toString();
                    String passwordprovided = password.getText().toString();
                    SharedPreferences.Editor editor = sp.edit();

                    editor.putString("user", username);
                    editor.putString("password", passwordprovided);
                    editor.commit();
                    Toast.makeText(MainActivity.this, "Your details are saved", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Your details are not saved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
