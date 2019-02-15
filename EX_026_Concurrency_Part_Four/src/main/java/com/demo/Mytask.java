package com.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class Mytask implements Callable<Integer> {
	
	private int noOfTimes;
	private LongAdder longAdd;
	
	

	public Mytask(int noOfTimes, LongAdder longAdd) {
		super();
		this.noOfTimes = noOfTimes;
		this.longAdd = longAdd;
	}



	@Override
	public Integer call() throws Exception {
		
		IntStream.rangeClosed(0, noOfTimes).boxed().forEach(i->{
			System.out.println(Thread.currentThread().getName());
			longAdd.add(i)	;
		});
		
		return longAdd.hashCode();
	}

}
