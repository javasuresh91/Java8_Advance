package com.demo.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.demo.pojo.Person;

public class InstanceMethodReference {

	public static void main(String[] args) {

		List<Person> listOfPer = new ArrayList<>();
		listOfPer.add(new Person("xx", 12));
		listOfPer.add(new Person("yy", 16));
		listOfPer.add(new Person("xiix", 1));
		listOfPer.add(new Person("xxr", 10));

		List<String> listOfName = InstanceMethodReference.getNameOfPerson(listOfPer, Person::getName); // Instance
																										// method
																										// reference
		listOfName.forEach(System.out::println);
	}

	private static List<String> getNameOfPerson(List<Person> listOfPer, Function<Person, String> f) {
		List<String> listOfPers = new ArrayList<>();
		listOfPer.forEach(n -> listOfPers.add(f.apply(n)));
		return listOfPers;
	}

}
