package com.sample.lambda.unit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseArrays {

	public static void main(String[] args) {
		reverseStringArray();
		reverseIntegerArray();

	}

	private static void reverseStringArray() {
		String stringArray[] = {"h","e","l","l","o"};
		
		Stream.of(stringArray)
        //.boxed() // Converts Intstream to Stream<Integer>
        .sorted(Collections.reverseOrder()) // Method on Stream<Integer>
        .forEach(System.out::println);
		
		System.out.println("=======Other way===");
		Arrays.stream(stringArray).sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

	private static void reverseIntegerArray() {
		System.out.println("=======");
		int intArray[] = {5,4,3,2,1};
		IntStream.of(intArray).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("otherway");
		Arrays.stream(intArray).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
	}

}
