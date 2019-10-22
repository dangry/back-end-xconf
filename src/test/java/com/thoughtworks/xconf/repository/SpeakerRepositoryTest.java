package com.thoughtworks.xconf.repository;

import java.io.IOException;
import java.util.List;

import com.thoughtworks.xconf.model.Speaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
public class SpeakerRepositoryTest {

    private SpeakerRepository speakerRepository;

    @BeforeEach
    public void setup() throws IOException {
        speakerRepository = new SpeakerRepositoryImpl();
    }

    @Test
    public void shouldGetSpeakersFromJsonFile() {
        List<Speaker> speakerList = speakerRepository.getAll();
        assertTrue(listHasElements(speakerList));
    }

    private boolean listHasElements(List<Speaker> speakerList) {
        return speakerList.size() > 0;
    }
}
