package com.thoughtworks.xconf.controller;

import com.thoughtworks.xconf.model.Speaker;
import com.thoughtworks.xconf.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpeakerController {

    private SpeakerRepository speakerRepository;

    @Autowired
    public SpeakerController(SpeakerRepository service) {
        this.speakerRepository = service;
    }

    @GetMapping("/speakers")
    List<Speaker> getAllSpeakers() {
        return speakerRepository.getAll();
    }

}
