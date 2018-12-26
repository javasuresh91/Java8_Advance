package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.pojo.Student;

/**
 * 
 * @collect() method is used to reduction mechanism
 * 
 * @It accept the Collector Type as a arguments, there are lot of predefined
 *     factory methods of Collectors available in the box
 * 
 * 	@toList(),toSet() are used to reduce/convert the Stream object as collect
 *     as Collection Object
 * 
 * @Joining() method is used to reduce/convert the Stream object as collect as
 *            String, it is overloaded in three different types
 * 
 * @Averaging method is used to reduce/convert the Stream object as collect as Average value    
 * 
 * @Sum methods can be do by summing method
 * 
 * @Summarizing will provide the summarize of the Stream Elements, it is application for Numeric Elements  
 * 
 * @Grouping can be achieved using groupingBy(), with many overloaded signature
 * 
 * @Stream elements can be divided using partitioningBy      
 *
 */
public class StreamCollectMethod {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("xxxx", 10));
		list.add(new Student("xx", 910));
		list.add(new Student("qwer", 100));

		list.add(new Student("oii", 180));
		list.add(new Student("surej", 100));

		// Reduce to Collection
		System.out.println("Using Lambda Expression :");
		List<String> collect = list.stream().map(e -> e.getName()).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("Using Method Reference :");
		Set<String> collect2 = list.stream().map(Student::getName).collect(Collectors.toSet());
		collect2.forEach(System.out::println);

		System.out.println("============================");
		// Reduce to String using Joining Method
		String collect3 = list.stream().map(Student::getName).collect(Collectors.joining());
		System.out.println(collect3);
		String collect4 = list.stream().map(Student::getName).collect(Collectors.joining("~~"));
		System.out.println(collect4);
		String collect5 = list.stream().map(Student::getName).collect(Collectors.joining("//", "[", "]"));
		System.out.println(collect5);

		System.out.println("============================");

		// Average Values
		Double collect6 = list.stream().collect(Collectors.averagingInt(Student::getAge));
		System.out.println(collect6);
		Double collect7 = list.stream().collect(Collectors.averagingDouble(Student::getAge));
		System.out.println(collect7);
		
		System.out.println("============================");
		
		//Summing and Summerzing values
		Integer collect8 = list.stream().collect(Collectors.summingInt(Student::getAge));
		System.out.println(collect8);		
		IntSummaryStatistics collect9 = list.stream().collect(Collectors.summarizingInt(Student::getAge));
		System.out.println(collect9);
		
		System.out.println("\n============================");
		//Grouping
		Map<Integer, List<Student>> collect10 = list.stream().collect(Collectors.groupingBy(Student::getAge));
		collect10.forEach((k,v)->{
			System.out.println("Key : "+k+" Value : "+v);
		});
		System.out.println("\n\n");
		Map<Integer, Set<Student>> collect11 = list.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.toSet()));
		collect11.forEach((k,v)->{
			System.out.println("Key : "+k+" Value : "+v);
		});
		System.out.println("\n============================");
		
		//Diving the Stream Elements based on Condition
		Map<Boolean, List<Student>> collect12 = list.stream().collect(Collectors.partitioningBy(s->s.getAge()>100));
		collect12.forEach((k,v)->{
			System.out.println("Key : "+k+" Value : "+v);
		});	
		System.out.println("\n============================");
		
		//Additional Reduction/transformation on Collectors
		Set<Student> collect13 = list.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		collect13.forEach(System.out::println);
		

	}

}
