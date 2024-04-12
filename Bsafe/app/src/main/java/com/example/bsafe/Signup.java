package com.example.bsafe;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

// Import the Person class if it's in a different package
import com.example.bsafe.Person;

public class Signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button button1 = findViewById(R.id.button30);
        Button button2 = findViewById(R.id.button31);
        button1.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Signup.this, Login.class);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Signup.this, DashBoard.class);
            startActivity(intent);
        });
    }
}
