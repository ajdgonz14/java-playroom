package com.learning.java.api.playroom.a.dependency.injection.common;

import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
