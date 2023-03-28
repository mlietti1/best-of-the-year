package org.lessons.java.bestoftheyear.model;

public class Content {
    private final int id;
    private String title;
    private String description;
    private String imgPath;

    public Content(int id, String title, String description, String imgPath) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imgPath = imgPath;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", title='" + title + '\'' +
                        ", description='" + description + '\'';
    }
}
