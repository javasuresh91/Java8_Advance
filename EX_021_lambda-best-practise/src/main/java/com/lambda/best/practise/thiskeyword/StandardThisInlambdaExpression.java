package com.lambda.best.practise.thiskeyword;

public class StandardThisInlambdaExpression {

	String value = "Class Level";
	public static void main(String[] args) {
		StandardThisInlambdaExpression obj = new StandardThisInlambdaExpression();
		obj.methodCall();

	}

	private void methodCall() {
		Foo foo = new Foo() {
			String value = "Inner Class Level";
			@Override
			public String method() {
				// TODO Auto-generated method stub
				return this.value;
			}
		};
		System.out.println(foo.method());
		System.out.println("===============================");
		Foo foos = ()->
		{
			String value = "lambda Level";
			return this.value;
		};
		System.out.println(foos.method());
		
	}

}
