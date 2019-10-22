package com.thoughtworks.xconf.repository;

import com.thoughtworks.xconf.model.Speaker;
import com.thoughtworks.xconf.repository.util.JsonFileUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SpeakerRepositoryImpl implements SpeakerRepository {

    private static final String JSON_PATH = "api-doubles/speakers.json";

    private List<Speaker> competencyList = new ArrayList<>();

    private JsonFileUtils jsonFileUtils = new JsonFileUtils();

    public SpeakerRepositoryImpl() throws IOException {
        Speaker[] speakers = jsonFileUtils.getObjectFromJson(JSON_PATH, Speaker[].class);
        competencyList.addAll(Arrays.asList(speakers));
    }

    public List<Speaker> getAll() {
        return competencyList;
    }
}
