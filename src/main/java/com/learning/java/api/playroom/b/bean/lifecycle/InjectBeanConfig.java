package com.learning.java.api.playroom.b.bean.lifecycle;

import com.learning.java.api.playroom.b.bean.lifecycle.common.LifeCycleDemo;
import com.learning.java.api.playroom.b.bean.lifecycle.common.MyInjectBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectBeanConfig {
    @Bean("beanie")
    public LifeCycleDemo myInjectBean(){
        return new MyInjectBean();
    }
}
