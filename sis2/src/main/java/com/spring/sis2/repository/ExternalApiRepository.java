package com.spring.sis2.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Repository
public class ExternalApiRepository {

    private final RestTemplate restTemplate;
    private static final String API_URL = "https://api.chucknorris.io/jokes/random";

    public ExternalApiRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> fetchDataFromExternalApi() {
        return restTemplate.getForObject(API_URL, Map.class);
    }
}