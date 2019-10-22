package com.thoughtworks.xconf.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeakersTest {

    @Test
    void shouldGetValidSpeakers() {
        Speaker speakerA = new Speaker("John", "Title", "http://foo.bar");
        Speaker speakerB = new Speaker("", "", "");
        Speaker speakerC = new Speaker("", "", "");

        List<Speaker> speakerList = Arrays.asList(speakerA, speakerB, speakerC);

        assertEquals(3, speakerList.size());
        assertEquals("John", speakerA.getName());
        assertEquals("Title", speakerA.getTitle());
        assertEquals("http://foo.bar", speakerA.getImageUrl());

    }
}
