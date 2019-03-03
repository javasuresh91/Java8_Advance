package com.compartor.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.compartor.dto.Employee;

/**
 * @This is natural way of sorting
 * @It means, handling the sorting algorithm based on the in-built sorting algorithm
 * @author admin
 *
 */
public class CompartorTest_06 {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Zaret", "andytwr", "loino", "xuuw", "Xaasd", "goat");

		System.out.println("\nBEfore Sorting:::::::::::::");
		asList.stream().forEach(System.out::println);
		
		asList.sort(Comparator.naturalOrder());
//		asList.sort(Comparator.reverseOrder());
		
		System.out.println("\nAfter Sorting:::::::::::::");
		asList.stream().forEach(System.out::println);
		

	}

}
