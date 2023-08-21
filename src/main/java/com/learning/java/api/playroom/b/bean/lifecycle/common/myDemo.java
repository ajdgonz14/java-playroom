package com.learning.java.api.playroom.b.bean.lifecycle.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class myDemo implements LifeCycleDemo {

    //define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("My Startup stuff");
    }

    //define destroy method
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("My Cleanup stuff");
    }

    @Override
    public String getDemo() {
        return "Testing my life";
    }
}
