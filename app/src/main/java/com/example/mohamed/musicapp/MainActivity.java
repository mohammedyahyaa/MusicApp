package com.example.mohamed.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout albums = (LinearLayout) findViewById(R.id.albumView);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Albums.class);
                startActivity(intent);
            }
        });
        LinearLayout artists = (LinearLayout) findViewById(R.id.artistView);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Artists.class);
                startActivity(intent);
            }
        });
        LinearLayout songs = (LinearLayout) findViewById(R.id.songView);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Songs.class);
                startActivity(intent);
            }
        });
    }
}

