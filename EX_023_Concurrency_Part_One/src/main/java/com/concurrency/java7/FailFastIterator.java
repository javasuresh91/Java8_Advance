package com.concurrency.java7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastIterator {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Apple", "IPhone");
		map.put("HTC", "HTC OS");
		map.put("Nokia", "Sibyan");
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		//Just we iterating the collection without doing the modification
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next+" : "+map.get(next));
			
		}
		System.out.println("=============");
		
		Iterator<String> iterator2 = keySet.iterator();
		//Doing the modification in the Collection
		while (iterator2.hasNext()) {
			String next = iterator2.next();
			System.out.println(next+" : "+map.get(next));
			map.put("Sony", "Xperia"); //Concurrent Modification Exception-FailFast Iterator
			
		}		

	}

}
