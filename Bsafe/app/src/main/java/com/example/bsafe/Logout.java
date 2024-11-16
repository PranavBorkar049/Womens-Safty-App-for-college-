package com.example.bsafe;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

// Import the Person class if it's in a different package
import com.example.bsafe.Person;

public class Logout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout);

        Button button1 = findViewById(R.id.button20);
        Button button2 = findViewById(R.id.button21);
        button1.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Logout.this, Signup.class);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Logout.this, Settings.class);
            startActivity(intent);
        });
    }
}
