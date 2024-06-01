package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

        private ImageButton imageButton2;
        private ImageButton imageButton3;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
            imageButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openhelloooo();
                }
            });
            imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
            imageButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openhelloooooo();
                }
            });

        }

        public void openhelloooo() {
            Intent intent = new Intent(this, MainActivityui.class);
            startActivity(intent);
        }

        public void openhelloooooo(){
            Intent intent = new Intent(this,MainActivityyt.class);
            startActivity(intent);
        }

    }
