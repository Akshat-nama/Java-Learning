package com.anuj.springBootCourse.springBootCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    DevDB db;

    String getData(){
        return db.getData();
    }

}
