package com.concurrency.java8;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsingReduce {

	public static void main(String[] args) {
		ConcurrentHashMap<String, UUID> conHashMap = new ConcurrentHashMap<>();

		for (int i = 1; i <= 5; i++) {
			conHashMap.put("Session_" + i, UUID.randomUUID());
		}

		/**
		 * @reduce is with 3 parameter
		 * @1st parameter is thread count
		 * @2nd parameter is transformer using BiFunction
		 * @3rd parameter is reducer using BiFunction (This give the combine result of
		 *      the reduce)
		 */
		String reduce = conHashMap.reduce(3, (k, v) -> k + ":" + v.toString(), (r1, r2) -> r1 + ",\n" + r2);
		System.out.println(reduce);
		System.out.println("============================");

		/**
		 * @NOTE :There are lot of overloaded methods on reduce method like
		 *       reduceKeys,reduceValues,reduceEntries and reduceToDouble and etc
		 */

		String reduceKeys = conHashMap.reduceKeys(2, (k1,k2)->k1+"~"+k2);
		System.out.println(reduceKeys);
	}

}
