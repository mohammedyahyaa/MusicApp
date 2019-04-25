package com.example.mohamed.musicapp;


public class Word {
    private String song;
    private String album;
    private String artist;

    public Word(String defualtSong, String defualtAlbum, String defualArtist) {

        song = defualtSong;
        album = defualtAlbum;
        artist = defualArtist;

    }

    public String getDefualtSong() {


        return song;
    }


    public String getDefualtAlbum() {


        return album;
    }

    public String getDefualtArtist() {


        return artist;
    }

}
