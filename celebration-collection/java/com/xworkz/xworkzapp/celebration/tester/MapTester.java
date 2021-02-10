package com.xworkz.xworkzapp.celebration.tester;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTester {
	public static void main(String a[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		String name = "Elon musk";
		int age = 45;

		map.put(name, age);
		map.put("kalam", 82);
		map.put("aleena rias", 25);
		map.put("sahla parveen", 40);
		map.put("gour gopal", 50);
		map.put(null, null);
		map.put("sahana", 21);
		map.put("raj", null);// keys can take null only once but value take any num of time
		System.out.println(map.size());

		Integer value = map.get("sahana");
		System.out.println(value);

		Integer value1 = map.get("null");
		System.out.println(value1);
		System.out.println("------------------------------------");

		Set<String> keys = map.keySet();
		keys.forEach(anything -> {
			Integer v = map.get(anything);
			System.out.println(anything + " age is:" + v);// printing both name & age
		});

		Set<String> keys1 = map.keySet();
		keys1.forEach(copy -> System.out.println(copy));
		System.out.println("-------------------------------------");
		Collection<Integer> values = map.values();
		values.forEach(j -> System.out.println(j));

		Set<Entry<String, Integer>> entryset = map.entrySet();
		entryset.forEach(e -> {

			System.out.println(e.getKey());
			System.out.println(e.getValue());
		});

	}

}
