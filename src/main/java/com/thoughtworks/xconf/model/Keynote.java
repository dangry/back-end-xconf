package com.thoughtworks.xconf.model;

public class Keynote {

    private String title;
    private String name;
    private String description;
    private String imageUrl;

    public Keynote(String name, String title, String description, String imageUrl) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
