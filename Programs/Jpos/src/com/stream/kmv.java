package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class kmv {

	public static void main(String[] args) {

		List<String> StringList = new ArrayList<>();

		//
		StringList.add("a");
		StringList.add("b");
		StringList.add("a");
		// In one line display all distinct records in stream
		System.out.println("\nUse stream for finding distinct elements and and display");

		Stream<String> stream = StringList.stream(); // Convert list (ArrayList)
														// of String to stream
		stream = StringList.stream();
		stream.distinct().forEach(System.out::println); // Displays -

		System.out.println("\n" + "SHORT-CIRCUITING operations - (terminal operations)");
		/*
		 * short-circuiting operations - (terminal operations) When infinite
		 * input is passed and finite stream is produced (in finite time).
		 * 
		 * StreamsExample
		 */

		System.out.println("\n1.Short-circuiting stateful intermediate operations");
		// short-circuiting stateful intermediate operation
		stream = StringList.stream();
		// findFirst() method - returns first element in the stream
		System.out.println("findFirst() method >");
		Optional<String> optional1 = stream.findFirst();
		System.out.println(optional1.get());

		stream = StringList.stream();
		// findAny() method - returns any element in the stream
		System.out.println("stream.findAny() >");
		Optional<String> optional2 = stream.findAny();
		System.out.println(optional2.get());

		stream = StringList.stream();
		// In one line find whether any record start with 'a' in stream
		boolean anyRecordStartsWithA = stream.anyMatch((s) -> s.startsWith("a"));
		System.out.println("\n2.any Record Starts With 'a'  = " + anyRecordStartsWithA); // true

		stream = StringList.stream();
		// In one line find whether all records start with 'a' in stream
		boolean allRecordStartsWithA = stream.allMatch((s) -> s.startsWith("a"));
		System.out.println("\n3.all Record Starts With 'a'  = " + allRecordStartsWithA); // false

		stream = StringList.stream();
		// In one line find whether none of the records start with 'b' in stream
		boolean noneRecordStartsWithB = stream.noneMatch((s) -> s.startsWith("b"));
		System.out.println("\n4.none Record Starts With 'b' = " + noneRecordStartsWithB); // true

		stream = StringList.stream(); // Convert list (ArrayList) to stream
		// In one line count records start with 'a' in stream
		long countOfRecordsStartsWithA = stream.filter((s) -> s.startsWith("a")).count();
		System.out.println("\n5.count Records Starts With 'a' = " + countOfRecordsStartsWithA); // 3

	}

}