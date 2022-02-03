package ques1;

import java.util.HashMap;
import java.util.Map;

public class CaseStudyOfMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);


		// Print map using stream

		System.out.println("Printing map using Stream");
		map.entrySet().stream()
		.forEach(entry -> System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue()));

		// Print only that records that contain key contains raj

		System.out.println("Printing records that contain key raj");
		map.entrySet().stream().filter(entry -> (entry.getKey()).equals("raj"))
		.forEach(entry -> System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue()));

		// Print map sorted by key

		System.out.println("Printing  map sorted by key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(entry -> System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue()));

		// Print map sorted by values

		System.out.println("Printing map sorted by values");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(entry -> System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue()));

		// Print map reverse sorted by the key

		System.out.println("Printing map sorted by key in reverse order");
		map.entrySet().stream().sorted((a, b) -> b.getKey().compareTo(a.getKey()))
		.forEach(entry -> System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue()));
	}

}


