package com.lambda.best.practise.self.explanatory;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		BiFunction<String, String, String> biFunc = (s1,s2)->{
			return getFullName(s1, s2);
		};
		String apply = biFunc.apply("Suresh", "Ravikumar");
		System.out.println(apply);
		
		System.out.println("=====================================");
		
		BiFunction<String, String, String> biFuncTwo = (s1,s2)->getFullName(s1, s2);
		String apply2 = biFuncTwo.apply("Suresh", "Ravikumar");
		System.out.println(apply2);
		
		System.out.println("=====================================");
		
		Function<String, String> uppserCaseStr = s->s.toUpperCase();
		System.out.println(uppserCaseStr.apply("hai"));
		//Instead of above implementation, we can use the method reference whenever necessary
		uppserCaseStr = String::toUpperCase;
		System.out.println(uppserCaseStr.apply("hai"));
		
	}

	private static String getFullName(String s1, String s2) {
		String firstname = s1.toUpperCase();
		String lastName = s2.toUpperCase();
		return firstname+"\t".concat(lastName);
	}

}
