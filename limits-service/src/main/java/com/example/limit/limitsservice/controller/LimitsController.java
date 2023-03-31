package com.example.limit.limitsservice.controller;

import com.example.limit.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/limits")
public class LimitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping()
    public String getLimits(){
        return String.valueOf(configuration.getMaximum() + configuration.getMinimum());
    }
}
