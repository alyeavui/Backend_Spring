package com.spring.sis2.service;

import com.spring.sis2.repository.ExternalApiRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExternalApiService {

    private final ExternalApiRepository repository;

    public ExternalApiService(ExternalApiRepository repository) {
        this.repository = repository;
    }

    public Map<String, Object> getData() {
        Map<String, Object> response = repository.fetchDataFromExternalApi();
        if (response == null || !response.containsKey("value")) {
            return Map.of(
                    "source", "https://api.chucknorris.io/jokes/random",
                    "value", "No data received"
            );
        }

        return Map.of(
                "source", "https://api.chucknorris.io/jokes/random",
                "value", response.get("value")
        );
    }
}