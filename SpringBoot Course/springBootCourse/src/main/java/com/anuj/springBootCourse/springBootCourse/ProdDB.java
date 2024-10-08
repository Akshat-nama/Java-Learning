package com.anuj.springBootCourse.springBootCourse;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component

public class ProdDB implements DB{

    public String getData() {
        return "Prod data";
    }
}
