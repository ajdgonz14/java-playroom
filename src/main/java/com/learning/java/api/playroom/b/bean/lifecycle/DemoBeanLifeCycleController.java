package com.learning.java.api.playroom.b.bean.lifecycle;

import com.learning.java.api.playroom.b.bean.lifecycle.common.LifeCycleDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bean")
public class DemoBeanLifeCycleController {
    private final LifeCycleDemo myCycle;
    @Autowired
    public DemoBeanLifeCycleController(@Qualifier("beanie") LifeCycleDemo theLifeCycle){
        myCycle = theLifeCycle;

    }


    @GetMapping("/demo")
    ResponseEntity<?> demo() {
        return new ResponseEntity<>(myCycle.getDemo(), HttpStatus.OK);
    }
}
