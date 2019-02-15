package com.concurrency.java7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {

	public static void main(String[] args) {
		
		System.out.println("======== Fail Safe ========");
		
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("Apple", "IPhone");
		concurrentHashMap.put("HTC", "HTC OS");
		concurrentHashMap.put("Nokia", "Sibyan");
		
		Set<String> keySet2 = concurrentHashMap.keySet();
		Iterator<String> iterator3 = keySet2.iterator();
		
		while (iterator3.hasNext()) {
			String next = iterator3.next();
			System.out.println(next+" : "+concurrentHashMap.get(next));
			concurrentHashMap.put("Sony", "Xperia"); //Concurrent Modification Exception will not occur -Failsafe Iterator
			
		}
				
		

	}

}
