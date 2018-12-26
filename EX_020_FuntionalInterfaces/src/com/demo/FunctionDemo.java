package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.demo.pojo.CustomPerson;

public class FunctionDemo {

	public static void main(String[] args) {
			
		List<CustomPerson> personMap =new ArrayList();
		personMap.add(new CustomPerson("xx", 12));
		personMap.add(new CustomPerson("yy", 16));
		personMap.add(new CustomPerson("xiix", 1));
		personMap.add(new CustomPerson("xxr", 10));
		
		personMap.forEach(person->System.out.println(person.customShow(per->per.getName()+"\t"+per.getAge())));
		System.out.println("=========================\n");
		Function<CustomPerson, String> result = s ->{
			return "Name : "+s.getName();
		};
		personMap.forEach(person->System.out.println(result.apply(person)));
		

	}

}
