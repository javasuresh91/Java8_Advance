package com.concurrency.java8;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsingForEachEntry {

	public static void main(String[] args) {
		ConcurrentHashMap<String,UUID> conHashMap = new ConcurrentHashMap<>();

		for (int i = 1; i < 50; i++) {
			conHashMap.put("Session_" + i,UUID.randomUUID());
		}
		
		/**
		 * Here iteration done by the 4 Parallel Thread
		 */
		//This method will give the key and value only as Map.EntrySet, we can perform any operation using EntrySet
		conHashMap.forEachEntry(4, e->{System.out.println(e.getKey() +"\t"+e.getValue());});
		
		

	}

}
