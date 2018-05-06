package com.tutorial.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.tutorial.spring.controller.StudentController;

@SpringBootApplication
@ComponentScan("com.tutorial.spring")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
