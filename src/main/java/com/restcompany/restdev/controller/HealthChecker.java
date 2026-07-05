package com.restcompany.restdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthChecker {
    @GetMapping("health-checker")
    public String healthcheck(){return "ok";}
}
