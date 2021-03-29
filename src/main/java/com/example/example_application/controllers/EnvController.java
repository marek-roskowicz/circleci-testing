package com.example.example_application.controllers;

import com.example.example_application.services.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class EnvController {

    private EnvService envService;

    @Autowired
    public EnvController(EnvService envService) {
        this.envService = envService;
    }

    @GetMapping
    public Map<String, String> getEnvPage(){
        return envService.getEnvVars();
    }
}
