package com.sample.lambda.unit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sample.unit1.Person;

public class CollectionIterationExample {
 /**
  * foreach Example
  * @param args
  */
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
			
		personList = Arrays.asList(new Person("Ram","Shri",60),
									new Person("Yug","Sharma",35),
									new Person("Srikant","Mishra",20),
									new Person("Vikas","Verma",40),
									new Person("Venki","Raju",30),
									new Person("Dheeraj","Joshi",40));
		
		/**
		 * for-in ->loop general for loop
		 * external iterator (parallel operation is not allowed)
		 */
		
		/**
		 * for-each loop  - internal iterator(parallel operation is possible)
		 * Consumer interface is implementation
		 * 
		 * sequence is not maintained that's why parallelism is allowed
		 */
		
		personList.forEach(e->System.out.println(e));
		/**
		 * method reference implementation
		 */
		personList.forEach(System.out::println);
		
		
		
		hashMapForEach();
	}

	private static void hashMapForEach() {
		System.out.println("================");
		System.out.println("hashMapForEach");
		
		
		Map<String,Integer> person = new HashMap<String,Integer>();
		person.put("Ram",60);
		person.put("Yug",35);
		person.put("Venki",30);
		person.put("Dheeraj",40);
		
		//Biconsumer is implemented
		person.forEach((k,v)-> {
			System.out.println("key = "+k + " Value = "+ v);
		});
		
	}

}
