package com.example.bsafe;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Newpass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newpass);

        Button button1 = findViewById(R.id.button22);
        Button button2 = findViewById(R.id.button23);

        button1.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Newpass.this,Password.class);
            startActivity(intent);
        });

        button2.setOnClickListener(view -> {
            // Handle button 2 click
            Intent intent = new Intent(Newpass.this, Login.class);
            startActivity(intent);
        });

    }
}
