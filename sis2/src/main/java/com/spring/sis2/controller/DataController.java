package com.spring.sis2.controller;

import com.spring.sis2.service.ExternalApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DataController {

    private final ExternalApiService service;

    public DataController(ExternalApiService service) {
        this.service = service;
    }

    @GetMapping("/data")
    public Map<String, Object> getData() {
        return service.getData();
    }
}