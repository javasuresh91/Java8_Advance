package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.pojo.Student;

/**
 * 
 * @Paralelly Execution of the stream can be achieved by EX_016_StreamInAdvanceConcept.StreamParallelizingAPI.java  
 *
 */

public class StreamOne {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("xxxx", 10));
		list.add(new Student("xx", 910));
		list.add(new Student("qwer", 100));

		list.add(new Student("oii", 180));
		list.add(new Student("surej", 1));
		/**
		 * @Parallel Processing - insertion order will wont follow
		 * @Stream FUnctionality is fully aplied to Parallel Stream
		 */
		Stream<Student> parallelStream = list.parallelStream();
		parallelStream.forEach(i -> {
			doProcess(i);
		});
	}

	private static void doProcess(Student i) {
		System.out.println(i);
	}

}
