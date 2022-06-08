package com.example.aichatbot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class HomePage extends AppCompatActivity {
    ImageButton btnMap;
    ImageButton btnChatBot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
    btnMap = findViewById(R.id.imgBtnMap);
     btnChatBot = findViewById(R.id.imgBtnChatBot);

            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(HomePage.this, MapsActivity.class));
                }
            });

            btnChatBot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(HomePage.this, MainActivity.class));
                }
            });
        }
    }

