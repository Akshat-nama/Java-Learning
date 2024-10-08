package com.anuj.springBootCourse.springBootCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringBootCourseApplication {

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCourseApplication.class, args);
	}

	public void run(String... args) throws Exception {

		System.out.println("My name is SPRING BOOT JAVA");
		System.out.println(dbService.getData());
	}

}


