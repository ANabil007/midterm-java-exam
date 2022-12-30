package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {


	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		// create an ArrayList of Strings
		ArrayList<String> luxuriousCars = new ArrayList<>();

		// add elements to the ArrayList using the add() method
		luxuriousCars.add("Ferrari");
		luxuriousCars.add("McLaren");
		luxuriousCars.add("Bentley");
		luxuriousCars.add("Lamborghini");

		//removing element at index 2
		luxuriousCars.remove(2);

		// retrieving one element from the ArrayList using get() method

		System.out.println("Best car is: "+ luxuriousCars.get(0));

		// retrieving all the elements of the list
		System.out.println("Retrieving all elements from the ArrayList");
		System.out.println("This is the list of the most luxurious cars: \n" + luxuriousCars);

		// retrieve the elements using a for-each loop
		System.out.println("Retrieving elements using for-each loop:");
		for (String cars : luxuriousCars) {
			System.out.println(cars);
		}

		// sorting the list in alphabetical order using the sort() method

		Collections.sort(luxuriousCars);
		System.out.println(luxuriousCars);


		// retrieve the elements using a while loop and an Iterator
		System.out.println("\nRetrieving elements using a while loop and an Iterator:");
		Iterator<String> iterator = luxuriousCars.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		// connect to the database and store the sorted list
		// (database connection code not shown)
		storeInDatabase(luxuriousCars);
	}

	private static void storeInDatabase(ArrayList<String> luxuriousCars) {
	}
}
