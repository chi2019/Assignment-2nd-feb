package com.example.tinku.b11alertdailoge;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textview);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id =view.getId();
        if(id ==R.id.textview){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("ALTER");
            builder.setMessage("Do you want to continue?");
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                }
            });


            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "This is the toast", Toast.LENGTH_SHORT).show();
                    LayoutInflater inflater = getLayoutInflater();
                    View myView = inflater.inflate(R.layout.toast_layout,null);
                    Toast myCustomToast = new Toast(MainActivity.this);
                    myCustomToast.setView(myView);
                    myCustomToast.setGravity(Gravity.CENTER,Gravity.CENTER_VERTICAL,Gravity.CENTER_HORIZONTAL);
                    myCustomToast.show();

                }
            });
            builder.show();
        }
    }
}
