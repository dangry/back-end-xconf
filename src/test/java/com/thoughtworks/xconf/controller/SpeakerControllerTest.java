package com.thoughtworks.xconf.controller;

import com.thoughtworks.xconf.model.Speaker;
import com.thoughtworks.xconf.repository.SpeakerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
public class SpeakerControllerTest {

    MockMvc mockMvc;

    @Mock
    SpeakerRepository speakerRepository;

    @InjectMocks
    private SpeakerController speakerController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(speakerController).build();
    }

    @Test
    @DisplayName("GET /speakers - Found")
    public void should_return_list_of_competencies_when_no_identifier_is_provided() throws Exception {
        Speaker speaker = new Speaker();

        List<Speaker> speakers = new ArrayList<>();
        speakers.add(speaker);

        when(speakerRepository.getAll()).thenReturn(speakers);

        mockMvc
                .perform(get("/speakers"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
