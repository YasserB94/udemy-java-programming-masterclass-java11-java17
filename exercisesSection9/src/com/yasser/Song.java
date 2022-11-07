package com.yasser;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    public String toString(){
        return new String(this.title + ": " + this.duration);
    }
    public String getTitle() {
        return title;
    }
}
