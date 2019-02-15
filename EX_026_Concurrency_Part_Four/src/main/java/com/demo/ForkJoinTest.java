package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAdder;

public class ForkJoinTest  {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		LongAdder longAdd = new LongAdder();
		Mytask myTask= new Mytask(10, longAdd);
		
		List<Callable<Integer>> tasks= new ArrayList<>();
		tasks.add(myTask);
		
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		Thread.sleep(1000);
		List<Future<Integer>> invokeAll = commonPool.invokeAll(tasks);
		
		for(Future<Integer> a:invokeAll)
		{
			a.get();
		}
		
		System.out.println(longAdd.intValue());
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
	}

}

