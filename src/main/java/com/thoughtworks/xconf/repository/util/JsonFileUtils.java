package com.thoughtworks.xconf.repository.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class JsonFileUtils {

    public <T> T getObjectFromJson(String jasonPath, Class<T> clazz) throws IOException {
        String textResult = readDataFromJson(jasonPath);
        return mapFromJson(textResult, clazz);
    }

    private String readDataFromJson(String jasonPath) {
        String result = "";
        ClassPathResource resource = new ClassPathResource(jasonPath);
        try {
            InputStream inputStream = resource.getInputStream();
            result =
                    new BufferedReader(new InputStreamReader(inputStream))
                            .lines()
                            .collect(Collectors.joining("\n"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private <T> T mapFromJson(String json, Class<T> clazz) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, clazz);
    }

}
