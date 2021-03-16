package com.basic;

public class PrimeCheck {

	/*
	 * * Java method to check if an integer number is prime or not. * @return true
	 * if number is prime, else false
	 */
	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) { // number is perfectly divisible - no prime
				return false;
			}
		}
		return true;

	}

	/* * Third way to check if a number is prime or not. */
	public static String isPrimeOrNot(int num) {
		
		if (num < 0) {
			return "not valid";
		}
		if (num == 0 || num == 1) {
			return "not prime";
		}
		if (num == 2 || num == 3) {
			return "prime number";
		}
		if ((num * num - 1) % 24 == 0) {
			return "prime";
		} else {
			return "not prime";
		}
	}

	public static void main(String[] args) {
		System.out.println(isPrime(17));
		System.out.println(isPrimeOrNot(5));
	}

}
