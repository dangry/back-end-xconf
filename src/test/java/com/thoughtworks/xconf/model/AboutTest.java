package com.thoughtworks.xconf.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AboutTest {

    @Test
    void shouldGetValidAbout() {
        About about = new About("Title", "Sub title", "Lorem ipsum");
        assertEquals("Title", about.getTitle());
        assertEquals("Sub title", about.getSubTitle());
        assertEquals("Lorem ipsum", about.getContent());
    }
}
