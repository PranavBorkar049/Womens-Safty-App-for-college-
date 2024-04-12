package com.example.bsafe;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

// Import the Person class if it's in a different package
import com.example.bsafe.Person;

public class DashBoard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Button button1 = findViewById(R.id.button9);

        button1.setOnClickListener(view -> {
            // Handle button 1 click
            Intent intent = new Intent(DashBoard.this, Settings.class);
            startActivity(intent);
        });
    }
}
