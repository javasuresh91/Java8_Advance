package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkSteelingpoolTest {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService newWorkStealingPool = Executors.newWorkStealingPool();
		System.out.println(Runtime.getRuntime().availableProcessors());
		List<Callable<String>> asList = Arrays.asList(()->"a",()->"b",()->"c");
		newWorkStealingPool.invokeAll(asList).stream().map(future->{
			System.out.println(Thread.currentThread().getName());
			try {
				return future.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
		
		
		

	}

}
