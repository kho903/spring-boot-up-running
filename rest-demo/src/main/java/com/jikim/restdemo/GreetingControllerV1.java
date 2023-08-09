package com.jikim.restdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting/v1")
public class GreetingControllerV1 {
	@Value("${greeting-name:KIM}")
	private String name;

	@Value("${greeting-coffee:${greeting-name} is drinking Cafe Ganador}")
	private String coffee;

	@GetMapping
	String getGreeting() {
		return name;
	}

	@GetMapping("/coffee")
	String getNameAndCoffee() {
		return coffee;
	}
}
