package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import com.demo.pojo.Person;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "H");
		map.put(2, "K");
		map.put(3, "L");
		
		BiConsumer<Integer, String> biConsumer = (K,V)->System.out.println("Key : "+K+"\t Value :"+V);
		
		map.forEach(biConsumer);
		System.out.println("================\n");
		
		map.forEach((K,V)->System.out.println("Key : "+K+"\t Value :"+V));
		System.out.println("================\n");
		
		Map<Integer, Person> personMap =new HashMap<>();
		personMap.put(1,new Person("xx", 12));
		personMap.put(2,new Person("yy", 16));
		personMap.put(3,new Person("xiix", 1));
		personMap.put(4,new Person("xxr", 10));
		
		personMap.forEach((K,V)->System.out.println("Key : "+K+"\t Value :"+V));
				

	}

}

