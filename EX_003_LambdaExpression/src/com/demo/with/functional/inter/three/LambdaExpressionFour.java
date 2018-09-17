package com.demo.with.functional.inter.three;

public class LambdaExpressionFour {

	public static void main(String[] args) {

		MyInterfaceWithReturn m1 = new MyInterfaceWithReturn() {

			@Override
			public boolean maxFlag(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 > num2;
			}
		};
		System.out.println("Without Lambda : "+m1.maxFlag(10, 3));
		System.out.println("-------------------------------");
		
		
		MyInterfaceWithReturn m2 = (num1, num2) -> num1 > num2;
		System.out.println("With LAmbda :"+m2.maxFlag(10, 30));
	}

}
