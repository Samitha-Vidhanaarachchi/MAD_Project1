package com.example.thestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

   // Button btn1 = (Button)findViewById(R.id.button2);

       public void send(View view)
       {
           Intent i = new Intent(LoginActivity.this, register.class);
           startActivity(i);
       }


}
