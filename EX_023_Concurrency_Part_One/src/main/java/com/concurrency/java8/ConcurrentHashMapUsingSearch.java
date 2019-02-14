package com.concurrency.java8;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsingSearch {

	public static void main(String[] args) {

		
		ConcurrentHashMap<Integer,UUID> conHashMap = new ConcurrentHashMap<>();

		for (int i = 1; i < 50; i++) {
			conHashMap.put(i,UUID.randomUUID());
		}
		
		/**
		 * Search Method, 1st parameter is thread count(parallelism)   , 2nd Parameter is key and value
		 */
		int id=20;
		String search = conHashMap.search(3, (k,v)->{
			if(k==id)
			{
				return new String(k+" : "+v);
			} else {
				return null;
			}
		});
		
		System.out.println("Using Search method :"+search);
		System.out.println("=========================");
		
		/**
		 * SearchEntries , 1St parameter is thread count and 2nd parameter is Map.Entry
		 */
		String searchEntries = conHashMap.searchEntries(4, mapEntry -> {
			if(mapEntry.getKey()==id) {
				return new String(mapEntry.getKey()+" : "+mapEntry.getValue());
			} else {
				return null;
			}
		});
		System.out.println("Using Search Entries :" +searchEntries);
		System.out.println("=========================");
		
		/**
		 * searchKeys , 1St parameter is thread count and 2nd parameter is only the key of the map
		 * 
		 */
		
		Integer searchKeys = conHashMap.searchKeys(3, k->{
			System.out.println(k);
			if(k>20) {
				return k; // Concurrent map does not maintain the insertion order so it return any value which will satisfy the condition first  
			} else {
				return null;
			}
		});
		
		System.out.println("Using Serach Keys : "+searchKeys);
		System.out.println("=========================");
		
		/**
		 * searchValues , 1St parameter is thread count and 2nd parameter is only the value of the map
		 */
		UUID searchValues = conHashMap.searchValues(4, v->{
			return v.toString().contains("ab") ? v : null;
		});
		
		System.out.println("Using Serach values : "+searchValues);
		System.out.println("=========================");
		

	}

}
