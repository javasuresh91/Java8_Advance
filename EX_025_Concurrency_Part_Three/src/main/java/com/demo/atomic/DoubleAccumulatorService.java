package com.demo.atomic;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulatorService implements Callable<Double>{

	private DoubleAccumulator doubleAccumulator;
	private long noOfTimes;
	
	
	
	public DoubleAccumulatorService(DoubleAccumulator doubleAccumulator, long noOfTimes) {
		super();
		this.doubleAccumulator = doubleAccumulator;
		this.noOfTimes = noOfTimes;
	}



	@Override
	public Double call() throws Exception {
		for(int i=1;i<=noOfTimes;i++) {
			System.out.println(Thread.currentThread().getName());
			doubleAccumulator.accumulate(10.0);
		}
		Double temp = doubleAccumulator.get();
		System.out.println("Temp : "+temp);
		return temp;
	}
	
	

	

}
