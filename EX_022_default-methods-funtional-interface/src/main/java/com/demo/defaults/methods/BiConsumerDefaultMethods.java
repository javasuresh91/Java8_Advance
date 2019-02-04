package com.demo.defaults.methods;

import java.util.function.BiConsumer;

public class BiConsumerDefaultMethods {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> adder = (i1,i2) -> System.out.println("Add : "+(i1+i2));
		BiConsumer<Integer, Integer> multipler = (i1,i2)->System.out.println("Multiple : "+(i1*i2));
		
		//andThen() is a default method
		
		adder.andThen(multipler).accept(10, 20);
		System.out.println("============================");
		multipler.andThen(adder).accept(50, 30);
		

	}

}
