package com.demo;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @reduce() and collect() are the methods which is used for the reduction mechanism
 * 
 * @Reduce Method is used Overloaded in three Different manner in the Stream
 *         Class, it a terminal operation.
 * @It uses terms like Identity,Accumulator and combiner as a arguments
 * @Identity has initial value or default value to accumulate
 * @Accumulator means, the logical expression which is used at every step of
 *              reducing(i.e.. lambda Expression)
 * @combiner used to write a logical expression which is used to collect the
 *           Accumulator Result
 * @Finally Reduce provide the last or single value
 *
 */
public class StreamReduceMethod {

	public static void main(String[] args) {

		/**
		 * @Type 1 : Reduce accept accumulator
		 * @Result 1+2=3=6
		 */
		OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println(reduce.getAsInt());

		System.out.println("==================");

		/**
		 * @Type 2: Reduce base value(Identity) and Accumulator
		 * @Result 10+1+2+3=16
		 */
		int reduce2 = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println(reduce2);

		System.out.println("==================");

		/**
		 * Type 3; Reduce base Value(Identity) and Accumulator and Combiner
		 * @Result 11,12+13=25,25+11=36
		 */
		Integer reduce3 = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("Combiner Worked");
			return a + b;
		});
		System.out.println(reduce3);

		System.out.println("==================");

	}

}
