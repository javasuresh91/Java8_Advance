package com.demo;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(1,2,3);
		int sum =listInt.stream().reduce(100, (x,y)->x+y);
		System.out.println("Reduction : "+sum);
		
		
	}

}
