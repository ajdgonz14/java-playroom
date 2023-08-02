package com.learning.java.api.playroom.dependency.injection;

import com.external.util.ExternalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/dependency")
public class DemoDependencyController {
    private Coach mycoach;
    private ExternalUtil externalUtil;

    @Autowired
    public  DemoDependencyController(Coach theCoach, ExternalUtil myUtil){
        mycoach = theCoach;
        externalUtil = myUtil;
    }

    @GetMapping("/run")
    ResponseEntity<?> run() {
        return new ResponseEntity<>(mycoach.getDailyWorkout(), HttpStatus.OK);
    }

    @GetMapping("/external")
    ResponseEntity<?> runExternal() {
        return new ResponseEntity<>(externalUtil.getUtil(), HttpStatus.OK);
    }
}
