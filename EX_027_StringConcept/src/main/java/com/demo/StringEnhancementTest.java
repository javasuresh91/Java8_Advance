package com.demo;

import java.util.Arrays;

public class StringEnhancementTest {

	public static void main(String[] args) {
		
		//Array of Char sequesnce
		String join = String.join("-", "Hello","India");
		System.out.println(join);
		
		
		//List of Char Sequenxce
		String join2 = String.join(" ", Arrays.asList("Hi","Idiots"));
		System.out.println(join2);

	}

}
