package com.example.bsafe;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

// Import the Person class if it's in a different package
import com.example.bsafe.Person;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        Button button1 = findViewById(R.id.button13);
        Button button2 = findViewById(R.id.button15);
        Button button3 = findViewById(R.id.button16);
        Button button4 = findViewById(R.id.button17);
        button1.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Settings.this, DashBoard.class);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            // Handle button 2 click
            Intent intent = new Intent(Settings.this, Friend.class);
            startActivity(intent);
        });
        button3.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Settings.this, About.class);
            startActivity(intent);
        });
        button4.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(Settings.this, Logout.class);
            startActivity(intent);
        });
    }
}
