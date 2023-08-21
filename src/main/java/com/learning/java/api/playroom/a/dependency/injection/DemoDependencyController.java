package com.learning.java.api.playroom.a.dependency.injection;

import com.external.util.ExternalUtil;
import com.learning.java.api.playroom.a.dependency.injection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/dependency")
public class DemoDependencyController {
    private final Coach mycoach;
    private final ExternalUtil externalUtil;

    /*Setter injection
        @Autowired
        public void setCoach(Coach theCoach, ExternalUtil myUtil){
            mycoach = theCoach;
            externalUtil = myUtil;
        }
    */

    //Constructor injection
    @Autowired
    //using @Qualifier
    //public DemoDependencyController(@Qualifier("baseballCoach") Coach theCoach, ExternalUtil myUtil) {

    public DemoDependencyController(Coach theCoach, ExternalUtil myUtil) {
        mycoach = theCoach;
        externalUtil = myUtil;
    }

    @GetMapping("/demo")
    ResponseEntity<?> demo() {
        return new ResponseEntity<>(mycoach.getDailyWorkout(), HttpStatus.OK);
    }

    @GetMapping("/external")
    ResponseEntity<?> runExternal() {
        return new ResponseEntity<>(externalUtil.getUtil(), HttpStatus.OK);
    }
}
