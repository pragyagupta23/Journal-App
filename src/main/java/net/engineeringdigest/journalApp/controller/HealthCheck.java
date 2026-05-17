package net.engineeringdigest.journalApp.controller;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("health-check")
    public String HealthCheck(){
        return "Ok";
    }
}
