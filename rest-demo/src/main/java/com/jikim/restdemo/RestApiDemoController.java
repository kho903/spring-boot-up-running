package com.jikim.restdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiDemoController {
	private List<Coffee> coffees = new ArrayList<>();

	public RestApiDemoController() {
		coffees.addAll(List.of(
			new Coffee("Cafe Cereza"),
			new Coffee("Cafe Ganador"),
			new Coffee("Cafe Lareno"),
			new Coffee("Cafe Tres Pontas")
		));
	}

	@GetMapping("/coffees")
	Iterable<Coffee> getCoffees() {
		return coffees;
	}
}
