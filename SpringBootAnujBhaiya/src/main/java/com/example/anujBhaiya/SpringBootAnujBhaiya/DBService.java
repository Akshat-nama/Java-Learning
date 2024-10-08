package com.example.anujBhaiya.SpringBootAnujBhaiya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    DB db;

    public DBService(DB db){
        this.db = db;
    }


   public void getData(){
       System.out.println(db.getData());
    }
}
