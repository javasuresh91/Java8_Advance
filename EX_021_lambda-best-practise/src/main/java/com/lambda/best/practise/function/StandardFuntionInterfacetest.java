package com.lambda.best.practise.function;

import java.util.function.Function;

public class StandardFuntionInterfacetest {

	public static void main(String[] args) {
		
		
		Foo foo = s->s+" From own Functional Interface";
		UseFoo useFoo = new UseFoo();
		String add = useFoo.add("Suresh", foo);
		System.out.println(add);
		
		System.out.println("===========================================");
		
		Function<String, String> func = s->s+" From JDK_1.8 Functional Interface";
		String add2 = useFoo.add("Suresh", func);
		System.out.println(add2);

	}

}
