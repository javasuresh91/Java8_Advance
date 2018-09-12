package com.demo;

/**
 *  
 */
public class FunctionalInterfaceUsingLambda {

	public static void main(String[] args) {

		Runnable withoutLambda = new Runnable() {
			@Override
			public void run() {
				System.out.println("Java 7 using Runnable");
			}
		};
		Thread t = new Thread(withoutLambda);
		t.start();

		Runnable withLambda = () -> System.out.println("Java 8 using Runnable");
		Thread t2 = new Thread(withLambda);
		t2.start();
	}

}
