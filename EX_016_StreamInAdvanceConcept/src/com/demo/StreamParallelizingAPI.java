package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.pojo.Student;

public class StreamParallelizingAPI {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student("xxxx", 10));
		list.add(new Student("xx", 910));
		list.add(new Student("qwer", 100));

		list.add(new Student("oii", 180));
		list.add(new Student("surej", 100));

		// Creating a Parallel Stream
		Stream<Student> parallelStream = list.parallelStream();
		/**
		 * @Checking the Stream is parallel or not, it should be called before the
		 *           terminal operation
		 */
		boolean parallel = parallelStream.isParallel();
		System.out.println(parallel);
		System.out.println("\n==============");
		//boolean anyMatch = parallelStream.anyMatch(age -> age.getAge() > 100);
		boolean anyMatch = parallelStream.map(age -> age.getAge() * 15).anyMatch(a -> a > 100);
		System.out.println(anyMatch);
		
		System.out.println("\n==============");
		
		//Create Parallel Stream From Non-Collection objects
		IntStream parallel2 = IntStream.range(0, 10).parallel();
		boolean parallel3 = parallel2.isParallel();
		System.out.println(parallel3);
		System.out.println("\n==============");
		//Parallel Stream can be concerted to sequential Stream.
		IntStream sequential = parallel2.sequential();
		boolean parallel4 = parallel2.isParallel();
		System.out.println(parallel4);

	}

}
