package com.jikim.restdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "greeting")
public class Greeting {
	private String name;
	private String coffee;
}
