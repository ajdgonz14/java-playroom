package com.external.util;

import org.springframework.stereotype.Component;

@Component
public class ExternalUtilTest implements ExternalUtil{
    @Override
    public String getUtil() {
        return "MyExternal";
    }
}
