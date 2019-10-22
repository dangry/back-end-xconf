package com.thoughtworks.xconf.repository;

import com.thoughtworks.xconf.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> getAll();
}
