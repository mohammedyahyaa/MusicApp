package com.example.mohamed.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        ArrayList<Word> Data = new ArrayList();


        Data.add(new Word("hello", "album1", "adele"));
        Data.add(new Word("never give up", "album2", "sia"));
        Data.add(new Word("what ever it takes ", "album3", "imagine dragons"));
        Data.add(new Word("something like this", "album4", "cold play"));
        Data.add(new Word("shine like diamond", "album5", "rihana"));
        Data.add(new Word("all of me ", "album6", "jhon legend"));



        WordAdapter itemsAdapter = new WordAdapter(this, Data);

        GridView listView = (GridView) findViewById(R.id.songs_list);

        listView.setAdapter(itemsAdapter);


        Button albums = (Button) findViewById(R.id.album);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Albums.class);
                startActivity(intent);
            }
        });
        Button mainpage = (Button) findViewById(R.id.mainpage);
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Button artists = (Button) findViewById(R.id.artist);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Artists.class);
                startActivity(intent);
            }
        });

    }
}
