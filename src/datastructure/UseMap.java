package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, databases.MySql] to store data and retrieve data.
		 */
		Map<Integer, String> map = new HashMap<>();
		map.put(01, "James");
		map.put(02, "Mike");
		map.put(03, "Tom");

		// retrieve the value for a key using the get() method
		String name = map.get(01);
		System.out.println("Number 01 is: " + name);

		// check if the Map contains a key using the containsKey() method
		boolean containsKey = map.containsKey(03);
		System.out.println("There is an element at position 03: " + containsKey);

		// check if the Map contains a value using the containsValue() method
		boolean containsValue = map.containsValue("Mike");
		System.out.println("Does map contain name Mike? answer: "+ containsValue);

		// retrieve the key-value pairs using the entrySet() method and a for-each loop
		System.out.println("Key-value pairs using a for-each loop:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}

}
