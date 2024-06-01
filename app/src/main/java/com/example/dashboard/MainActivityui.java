package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivityui extends AppCompatActivity {
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainui);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhellooooo();
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhellooooooo();
            }
        });

    }

    public void openhellooooo() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void openhellooooooo() {
        Intent intent = new Intent(this, MainActivitywk.class);
        startActivity(intent);
    }

}