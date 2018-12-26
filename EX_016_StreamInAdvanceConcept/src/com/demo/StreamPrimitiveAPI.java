package com.demo;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * 
 * @Stream<T> Accept only Generic type not the primitive type like int, long and
 *            etc,
 * 
 * @So java 8 introduce Three new special Interface
 *     1.IntStream,2.LongStream,3.DoubleStream with supports the primitive type
 *     Stream Object
 * 
 * @Random Class in java 8 provide wide range of Methods for generating the
 *         primitive type values
 *
 */
public class StreamPrimitiveAPI {

	public static void main(String[] args) {
		/**
		 * Excluded the last value
		 */
		IntStream range = IntStream.range(0, 10);
		range.forEach(System.out::println);

		System.out.println("=======================================");

		IntStream rangeClosed = IntStream.rangeClosed(0, 10);
		rangeClosed.forEach(System.out::println);

		System.out.println("=======================================");

		LongStream range2 = LongStream.range(0, 10);
		range2.forEach(System.out::println);

		System.out.println("=======================================");
		 		
		Random random = new Random();
//		DoubleStream doubles = random.doubles();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);

		System.out.println("=======================================");
		
		

	}

}
