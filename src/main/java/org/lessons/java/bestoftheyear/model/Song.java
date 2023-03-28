package org.lessons.java.bestoftheyear.model;

public class Song extends Content {

    private String artist;
    private String album;

    public Song(int id, String title, String description, String artist, String album, String imgPath) {
        super(id, title, description, imgPath);
        this.artist = artist;
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                super.toString() + '\'' +
                "artist='" + artist + '\'' +
                "} " + super.toString();
    }
}
