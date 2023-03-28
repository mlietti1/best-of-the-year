package org.lessons.java.bestoftheyear.model;

public class Movie extends Content {

    private String director;

    public Movie(int id, String title, String description, String director, String imgPath) {
        super(id, title, description, imgPath);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                super.toString() + '\'' +
                "director='" + director + '\'' +
                "} ";
    }
}