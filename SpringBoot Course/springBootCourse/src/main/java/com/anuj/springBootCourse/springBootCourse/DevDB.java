package com.anuj.springBootCourse.springBootCourse;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component

public class DevDB implements DB{

    public String getData() {
       return "Dev data";
    }
}
