package com.concurrency.java8;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsingForEach {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> conHashMap = new ConcurrentHashMap<>();
		
		for(int i=1;i<101;i++) {
			conHashMap.put(i, "Person_"+i);
		}
		
		//Single Thread with Sequence flow
		conHashMap.forEach((key,value)->{
			System.out.println("Thread : "+Thread.currentThread().getName());
			System.out.println(key+"\t"+value);
		});
		
		System.out.println("\n========================");
		/**
		 * Here iteration done by the 3 Parallel Thread
		 */
		//Multiple thread with parallel Flow
		conHashMap.forEach(3,(key,value)->{
			System.out.println("Parallel Thread : "+Thread.currentThread().getName());
			System.out.println(key+"\t"+value);
		});
	}

}
