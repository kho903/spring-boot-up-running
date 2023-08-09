package com.jikim.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

}
