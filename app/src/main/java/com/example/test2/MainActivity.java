package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;
// Reminder to include right package
public class MainActivity extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2); // Registration button to new activity
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregActivity(); // This opens the activity on click for the button
            }
        });
    }
    public void openregActivity() { // Function for button opening registration activity
        Intent intent = new Intent(this, regActivity.class);
        startActivity(intent);
    }
}