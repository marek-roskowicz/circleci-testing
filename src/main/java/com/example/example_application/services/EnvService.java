package com.example.example_application.services;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EnvService {

    public Map<String, String> getEnvVars(){
        return System.getenv();
    }
}
