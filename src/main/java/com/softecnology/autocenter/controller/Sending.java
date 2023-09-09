package com.softecnology.autocenter.controller;

import com.softecnology.autocenter.service.SendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sending")
public class Sending {
    @Autowired
    SendingService sendingService;
    @GetMapping("/{state}")
    public String generateName(@PathVariable("state") String state){
        return sendingService.swithLed(state);
    }
}
