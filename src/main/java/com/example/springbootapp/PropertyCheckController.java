package com.example.springbootapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyCheckController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @GetMapping("/config-check")
    public String checkConfig() {
        return "Server Port: " + serverPort + ", Datasource URL: " + datasourceUrl;
    }
}
