package com.thoughtworks.xconf.model;

public class About {

    private String title;
    private String subTitle;
    private String content;

    public About(String title, String subTitle, String content) {
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getContent() {
        return content;
    }
}
