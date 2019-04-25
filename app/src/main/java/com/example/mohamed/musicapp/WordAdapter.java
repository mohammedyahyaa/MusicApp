package com.example.mohamed.musicapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mohamed on 30/06/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {




    public WordAdapter(Activity context, ArrayList<Word> Data) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);

        songTextView.setText(currentWord.getDefualtSong());



        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_name);

        albumTextView.setText(currentWord.getDefualtAlbum());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);

        artistTextView.setText(currentWord.getDefualtArtist());





        return listItemView;
    }
}
