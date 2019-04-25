package com.example.mohamed.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    ListView listView;
    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        Button songs = (Button) findViewById(R.id.songs);

        ArrayList<Word> Data = new ArrayList();


        Data.add(new Word("hello" , "album1" ,"adele"));
        Data.add(new Word("never give up" , "album2" ,"sia"));
        Data.add(new Word("what ever it takes " , "album3" ,"imagine dragons"));
        Data.add(new Word("something like this" , "album4" ,"cold play"));
        Data.add(new Word("shine like diamond", "album5", "rihana"));
        Data.add(new Word("all of me ", "album6", "jhon legend"));





        WordAdapter itemsAdapter = new WordAdapter(this,Data);

        GridView listView = (GridView) findViewById(R.id.artist_list);

        listView.setAdapter(itemsAdapter);






        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Songs.class);
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
        Button albums= (Button) findViewById(R.id.album);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Albums.class);
                startActivity(intent);
            }
        });

    }
}
