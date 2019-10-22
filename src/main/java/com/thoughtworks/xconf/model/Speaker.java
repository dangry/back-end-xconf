package com.thoughtworks.xconf.model;

public class Speaker {

    private String name;
    private String title;
    private String imageUrl;

    public Speaker() {
    }

    public Speaker(String name, String title, String imageUrl) {
        this.name = name;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
