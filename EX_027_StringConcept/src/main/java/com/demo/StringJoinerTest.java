package com.demo;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("Hi").add("Everyone").add("How do you do..?");
		System.out.println(stringJoiner);
		System.out.println("======================");
		
		StringJoiner stringJoiner2 = new StringJoiner(" ","[", "]");
		stringJoiner2.add("india").add("is").add("beatiful");
		System.out.println(stringJoiner2);
		System.out.println("======================");
		
		StringJoiner merge = stringJoiner.merge(stringJoiner2);
		System.out.println(merge);
		System.out.println("======================");		

	}

}
