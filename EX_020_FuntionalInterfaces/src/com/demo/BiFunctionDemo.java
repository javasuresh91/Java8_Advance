package com.demo;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction = (num1,num2)->"Result : "+(num1+num2);
		System.out.println(biFunction.apply(10, 2));

	}

}
