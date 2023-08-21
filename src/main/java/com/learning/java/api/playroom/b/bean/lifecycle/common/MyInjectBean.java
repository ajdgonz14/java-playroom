package com.learning.java.api.playroom.b.bean.lifecycle.common;

public class MyInjectBean implements LifeCycleDemo{
    public MyInjectBean(){
        System.out.println("injecting bean");
    }
    @Override
    public String getDemo() {
        return "Swim swim";
    }
}
