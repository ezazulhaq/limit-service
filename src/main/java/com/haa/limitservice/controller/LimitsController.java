package com.haa.limitservice.controller;

import com.haa.limitservice.bean.Limits;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping(path = "/limits")
    public Limits retriveLimits() {
        return new Limits(1, 1000);
    }
}
