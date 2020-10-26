package com.sample.lambda.unit4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompratorImplmentation {

	public static void main(String[] args) {
		
		comparableSort_MethodReference();
		
		compare();
		
	}

	private static void compare() {
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		
		numbers = numbers.stream().sorted((a,b) -> a.compareTo(b) ).collect(Collectors.toList());
		
		System.out.println(numbers);
		
	}

	private static void comparableSort_MethodReference() {
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		
		numbers = numbers.stream().sorted(Integer::compareTo).collect(Collectors.toList());
		
		System.out.println("Method reference  "+numbers);
		
		//System.out -> provide instance object
		//println is the method
		numbers.stream().sorted(Integer::compareTo).forEach(System.out::println);
		
	}

}
