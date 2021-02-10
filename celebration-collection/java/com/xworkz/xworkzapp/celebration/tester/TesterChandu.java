package com.xworkz.xworkzapp.celebration.tester;

import java.util.Optional;

public class TesterChandu {
	public static void main(String[] args) {

		String email = null;
		System.out.println(email);
		if (email != null) {
			System.out.println(email.toLowerCase());
		}

		Optional<String> optional = Optional.of("sahana.xworkz@gmail.com");

		System.out.println(optional.isPresent());

		Optional<Integer> yearOptional = Optional.empty();

		System.out.println(yearOptional.isPresent());

		//yearOptional.ifPresent((v) -> System.out.println(v));

		Optional<String> country = Optional.ofNullable("India");

		country.ifPresent(e -> {
			String value = country.map(String::toUpperCase).get();
			System.out.println(value);

		});

		String def = country.orElse("Srilanka");
		System.out.println(def);

	}

}
