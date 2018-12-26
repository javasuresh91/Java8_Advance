package com.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @Infinite Stream need to end with Terminate Method like limit,anyMatch,count,forEach, It is eager approach
 * @Inifinite Stream need to starts with Intermediate Method Like iterate,filter,map,flatMap
 *
 */
public class InfiniteStreamOne {

	public static void main(String[] args) {
		/**
		 * To Create a Infinite Stream Object using iterate
		 */
		Stream<Integer> iterate = Stream.iterate(0, i -> i + 2);
		List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		Stream<String> iterate2 = Stream.iterate("Suresh", s->s+" hai");
		List<String> limit = iterate2.limit(5).collect(Collectors.toList());
		limit.forEach(System.out::println);
		
		
		

	}

}
