package com.example.bsafe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button button1 = findViewById(R.id.button33);
        button1.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Login.this,Person.class);
            startActivity(intent);
        });


    }

}
