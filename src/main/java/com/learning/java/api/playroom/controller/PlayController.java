package com.learning.java.api.playroom.controller;

import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PermitAll
@RequestMapping("/v1/play")
public class PlayController {
    @Value("${guild.name}")
    private String guildName;


    @Value("${guild.master}")
    private String guildMaster;


    @GetMapping("/run")
    public ResponseEntity<?> run() {
        return new ResponseEntity<>("Hooray!", HttpStatus.OK);
    }


    @GetMapping("/getConfig")
    public ResponseEntity<?> getConfig() {
//        String message = String.format("Welcome party %p from %g", partyName, guildName);
        String message = String.format("Welcome home to %s master %s", guildName, guildMaster);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
