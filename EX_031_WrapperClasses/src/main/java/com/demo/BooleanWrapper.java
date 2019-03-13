package com.demo;

import java.util.Scanner;

/**
 * 
 * @We can perform logical gates operation on Boolean
 *
 */
public class BooleanWrapper {

	public static void main(String[] args) {
		
		try(Scanner s = new Scanner(System.in)) {
			
			System.out.println("Enter first Boolean Value :");
			boolean nextBoolean = s.nextBoolean();
			System.out.println("Enter Second Boolean Value :");
			boolean nextBoolean2 = s.nextBoolean();
			int hashCode = Boolean.hashCode(nextBoolean);
			System.out.println("Has Code : "+hashCode);
			System.out.println("=================");
			int hashCode2 = Boolean.hashCode(nextBoolean2);
			System.out.println("Has Code : "+hashCode2);
			
			System.out.println("=================");
			boolean logicalAnd = Boolean.logicalAnd(nextBoolean, nextBoolean2);
			System.out.println("Logical AND : "+logicalAnd);
			
			System.out.println("=================");
			boolean logicalOr = Boolean.logicalOr(nextBoolean, nextBoolean2);
			System.out.println("Logical OR : "+logicalOr);
			
			System.out.println("=================");
			boolean logicalXor = Boolean.logicalXor(nextBoolean2, nextBoolean);
			System.out.println("Logical XOR : "+logicalXor);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
