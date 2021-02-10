package com.xworkz.xworkzapp.celebration.tester;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

    public class TesterSahana {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>((a,b)->a.compareTo(b)); // tree sort only key
		map.put("Jai ho", "Vijay Prakash");
		map.put("Kabira", "Arijith singh");
		map.put("Perfect", "Ed Shreeran");
		map.put("Happy Agide", "All Ok");
		// System.out.println(map);//not ordered
		//both prints the same first print cz, we override string().
		map.forEach((k,v)->System.out.println(k+ " " + v));

		Set<Entry<String, String>> entryset = map.entrySet(); // un ordered
		// System.out.println(entryset);
		entryset.forEach(entry -> {
			System.out.println("song is: " + entry.getKey() + " singer is: " + entry.getValue());
		});
		
		Properties properties = new Properties();
		properties.setProperty("name", "gmail");
		properties.getProperty("name", "4");
		properties.getProperty("name");
		System.out.println(properties);
		
		
		

	}

}
