package com.thoughtworks.xconf.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeynoteTest {


    @Test
    void shouldGetValidKeynote() {
        Keynote keynote = new Keynote("Martin Flores", "Chief Scientist", "Description", "http://foo.bar");
        assertEquals("Martin Flores", keynote.getName());
        assertEquals("Chief Scientist", keynote.getTitle());
        assertEquals("Description", keynote.getDescription());
        assertEquals("http://foo.bar", keynote.getImageUrl());
    }
}
