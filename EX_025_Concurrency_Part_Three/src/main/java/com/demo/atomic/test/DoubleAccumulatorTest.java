package com.demo.atomic.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAccumulator;

import com.demo.atomic.DoubleAccumulatorService;

public class DoubleAccumulatorTest {

	public static void main(String[] args) {
		
		/**
		 * @DoubleAccumulator is take the two parameter
		 * @1St is Functional Interface(DoubleBinaryOperator), it define the implementation of the DoubleAccumulator 
		 * @2nd is initial value 
		 */
		DoubleAccumulator doubleAccumulator = new DoubleAccumulator((x,y)->x+y, 5.0);
		
		DoubleAccumulatorService doubleAccumulatorService = new DoubleAccumulatorService(doubleAccumulator, 10L);
		DoubleAccumulatorService doubleAccumulatorService2 = new DoubleAccumulatorService(doubleAccumulator, 10L);
		
		List<Callable<Double>> tasks = new ArrayList<>();
		tasks.add(doubleAccumulatorService);
		tasks.add(doubleAccumulatorService2);
		
		try {
			List<Future<Double>> invokeAll = Executors.newFixedThreadPool(2).invokeAll(tasks);
			
			invokeAll.forEach(action->{
				try {
					action.get();
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			System.out.println(doubleAccumulator.doubleValue());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
