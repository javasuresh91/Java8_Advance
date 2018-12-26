package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(2,5,6,3,9,1,7);
		UnaryOperator<Integer> unInteger = (i)->i*i;
		unaryOperatorFunction(unInteger,asList).forEach(System.out::println);

	}

	private static List<Integer> unaryOperatorFunction(UnaryOperator<Integer> unInteger, List<Integer> asList) {
		List<Integer> asLists = new ArrayList<>();
		asList.forEach(list->asLists.add(unInteger.apply(list)));
		return asLists;
		
		
				
		
	}

}
