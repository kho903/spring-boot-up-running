package com.jikim.restdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/coffees/{id}")
	Optional<Coffee> getCoffeeById(@PathVariable String id) {
		for (Coffee coffee : coffees) {
			if (coffee.getId().equals(id)) {
				return Optional.of(coffee);
			}
		}
		return Optional.empty();
	}

	@PostMapping("/coffees")
	Coffee postCoffee(@RequestBody Coffee coffee) {
		coffees.add(coffee);
		return coffee;
	}

	@PutMapping("/coffees/{id}")
	Coffee putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
		int coffeeIndex = -1;

		for (Coffee c : coffees) {
			if (c.getId().equals(id)) {
				coffeeIndex = coffees.indexOf(c);
				coffees.set(coffeeIndex, coffee);
			}
		}

		return (coffeeIndex == -1) ? postCoffee(coffee) : coffee;
	}
}
