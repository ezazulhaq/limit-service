package com.haa.limitservice.controller;

import com.haa.limitservice.bean.Limits;
import com.haa.limitservice.configuration.LimitConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping(path = "/limits")
    public Limits retriveLimits() {
        // return new Limits(1, 1000);
        return new Limits(limitConfiguration.getMinimum(), limitConfiguration.getMaximum());
    }
}
