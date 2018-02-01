package com.example.tinku.broadcastreciver;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activitytostopservice extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytostopservice);

      button =findViewById(R.id.buttontostopservice);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(activitytostopservice.this, "Stop Service Clicked", Toast.LENGTH_SHORT).show();
              stopService(new Intent(activitytostopservice.this,receivebroadcastandstartservice.class));
          }
      });
    }

}
