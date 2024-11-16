package com.example.bsafe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button button1 = findViewById(R.id.button6);

        button1.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Register.this, Password.class);
            startActivity(intent);
        });
    }
}
