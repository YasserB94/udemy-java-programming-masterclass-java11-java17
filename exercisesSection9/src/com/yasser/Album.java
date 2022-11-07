package com.yasser;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addToPlayList(int trackIndex, LinkedList<Song> playlist){
        trackIndex--;
        if(trackIndex<0 || trackIndex > this.songs.size()){
            return false;
        }
        return playlist.add(this.songs.get(trackIndex));
    }
    public boolean addToPlayList(String trackTitle,LinkedList<Song> playlist){
        Song tmp = this.findSong(trackTitle);
        if(tmp==null){
            return false;
        }
        return playlist.add(tmp);
    }
    public boolean addSong(String title,double duration){
        if(this.findSong(title)!=null){
            return false;
        }
        return this.songs.add(new Song(title,duration));
    }
    private Song findSong(String title){
        for (Song song:this.songs) {
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }
}
