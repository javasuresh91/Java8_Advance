package com.concurrency.java8;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsingForEachValue {

	public static void main(String[] args) {
		ConcurrentHashMap<String,UUID> conHashMap = new ConcurrentHashMap<>();

		for (int i = 1; i < 50; i++) {
			conHashMap.put("Session_" + i,UUID.randomUUID());
		}
		
		/**
		 * Here iteration done by the 3 Parallel Thread
		 */
		//This method will give the value only, we can perform any operation
		conHashMap.forEachValue(3, System.out::println);

	}

}
