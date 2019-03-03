package com.compartor.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Using comparingInt() and its type of method
 * 
 * @author admin
 *
 */
public class CompartorTest_04 {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Zaret", "andytwr", "loino", "xuuw", "Xaasd", "goat");
		Comparator<String> comparingInt = Comparator.comparingInt(String::length);
		System.out.println("\nBefore Sorting:::::::::::::");
		asList.stream().forEach(System.out::println);
		Collections.sort(asList, comparingInt);
		System.out.println("\nAfter Sorting:::::::::::::");
		asList.stream().forEach(System.out::println);
	}

}
