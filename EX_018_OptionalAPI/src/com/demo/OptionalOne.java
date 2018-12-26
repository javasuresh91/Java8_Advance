package com.demo;

import java.util.Optional;

public class OptionalOne {

	/**
	 * @Optional class is a Immutable Class
	 * @It is used to escape the programmer from Null Pointer Exception(NPE) *
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Optional Instance creation
		 */
		Integer one = null;
		Integer two = 2;
		Integer three = new Integer(3);
		
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);
		System.out.println("================\n");
		Optional<Integer> of = Optional.of(two);
		System.out.println(of);
		System.out.println(of.get());
		
		System.out.println("================\n");
		Optional<Integer> of2 = Optional.of(three);
		System.out.println(of2);
		System.out.println(of2.get());
		
		System.out.println("================\n");
		
		Optional<Integer> ofNullable = Optional.ofNullable(one);
		System.out.println(ofNullable);
		
		
		System.out.println("================\n\nChecking Optional");
		System.out.println(ofNullable.isPresent());
		System.out.println(of2.isPresent());
		
		System.out.println("Addition 1 : "+(of2.get()+of.orElse(0)));
		System.out.println("Addition 2 : "+(of2.get()+ofNullable.orElse(0)));
		System.out.println("Addition 3 : "+(of2.get()+ofNullable.get()));
		
		
		

	}

}
