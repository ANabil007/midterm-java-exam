package math.problems;

import databases.ConnectToSqlDB;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int n = 1000000;
		System.out.println(printPrime(n));

	}

		static boolean isPrime(int n)
		{
			// Corner case
			if (n <= 1)
				return false;

			// Check from 2 to n-1
			for (int i = 2; i < n; i++)
				if (n % i == 0)
					return false;

			return true;
		}

		// Function to print primes
		static ArrayList printPrime(int n)
		{
			ArrayList arrayList = new ArrayList<>();
			for (int i = 2; i <= n; i++) {
				if (isPrime(i))
					arrayList.add(i);
			}
			return arrayList;
		}





}
