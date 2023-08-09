package com.jikim.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/droid")
public class DroidController {
	private final Droid droid;

	@GetMapping
	public Droid getDroid() {
		return droid;
	}
}
