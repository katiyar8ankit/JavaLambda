/**
 * 
 */
package com.sample.lambda.unit4;


public class MethodReference {

	/**
	 * There are four kinds of method references:

			Static methods
			Instance methods of particular objects
			Instance methods of an arbitrary object of a particular type
			Constructor

	 */
	public MethodReference() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Thread t = new Thread(()->printMessage());
		t.start();
		 */
		//static method reference 
		Thread t = new Thread(MethodReference::printMessage);  //  Thread t = new Thread(()->printMessage());
		t.start();
		
		
		/**
		 * instance method reference

		 * method reference with input parameters
		 */
		
				
		
		
	}
	
	
	public static void printMessage() {
		System.out.println("thread has started");

	}

}
