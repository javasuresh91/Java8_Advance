package com.demo.defaults.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDefaultMethods {

	public static void main(String[] args) {
		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(1, "hai");
		empMap.put(2, "suresh");
		empMap.put(3, "welcome");
		empMap.put(4, "your");
		empMap.put(5, "day is");
		empMap.put(6, "good");
		/**
		 * @getOrDefault() will return the default value if the map does not contain the
		 *                 specify key, if key present in the map, it will return the
		 *                 original value.
		 */
		System.out.println(empMap.getOrDefault(7, "defaultVal"));
		System.out.println(empMap.getOrDefault(6, "default"));
		System.out.println("=========================");

		/**
		 * @Foreach() it is used to iterate the map and do our own any logic
		 */
		empMap.forEach((k, v) -> {
			System.out.println("Key: " + k);
			System.out.println("Value: " + v);
		});
		System.out.println("=========================");

		/**
		 * @replaceAll() it will accept only BiFunction Implementation only.
		 * @The value returned by the BiFunction will replace the value of the
		 *      corresponding key in the map
		 */
		empMap.replaceAll((n1, n2) -> {
			return n2 + n1;
		});

		System.out.println(empMap);
		System.out.println("=========================");

		/**
		 * @putIfAbsent(key,value) method will add the key and value to the map, if the
		 *                         key is not present in the map object
		 * @This method will return the null value.
		 * @if the key present in the map, it will not replace the value but return the
		 *     corresponding value
		 */
		String putIfAbsent = empMap.putIfAbsent(7, "guest");
		System.out.println(putIfAbsent);
		System.out.println(empMap);
		System.out.println("\n");
		String putIfAbsents = empMap.putIfAbsent(7, "guests"); // It wont replace
		System.out.println(putIfAbsents);
		System.out.println(empMap);
		System.out.println("=========================");

		/**
		 * @remove(key,value) method is used to remove the key if present in the map
		 *                    with the given value and return boolean
		 */

		boolean remove = empMap.remove(7, "guest");
		System.out.println(remove);
		System.out.println(empMap);
		System.out.println("\n");
		boolean remove2 = empMap.remove(6, "hai"); // It wont remove
		System.out.println(remove2);
		System.out.println(empMap);
		System.out.println("=========================");

		/**
		 * @replace(key,oldValue,newValue) method will replace the given new value, if
		 *                                 the given key and old value matches the map
		 *                                 entry
		 */
		boolean replace = empMap.replace(6, "good6", "good Day");
		System.out.println(replace);
		System.out.println(empMap);
		System.out.println("\n");
		replace = empMap.replace(6, "good6", "good Day"); // It wont replace
		System.out.println(replace);
		System.out.println(empMap);
		System.out.println("=========================");

		/**
		 * @Compute default method is used to change the value of the particular key in
		 *          the map with new value or for new key and new value,
		 * @It is error prone, because if the new value is null, the key will be remove
		 *     from the map if exist and for new key if the value is null, it wont add
		 *     into the map.
		 * 
		 */
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(10, "Java");
		map.put(2, "Test");
		System.out.println("Before Using Compute : " + map);
		System.out.println("\n");

		String compute = map.compute(10, (currentKey, currentvalue) -> currentvalue + " Changed");
		System.out.println("Computed Value : " + compute);
		System.out.println("After Using Compute : " + map);
		System.out.println("\n");

		// Passing null to the new value
		String compute2 = map.compute(2, (currentKey, currentvalue) -> null);
		System.out.println("Computed Value 2: " + compute2);
		System.out.println("After Using Compute By passing Null: " + map);
		System.out.println("\n");

		// Passing New key and with value
		String compute3 = map.compute(4, (currentKey, currentValue) -> "New key and value using compute");
		System.out.println("Computed Value 3: " + compute3);
		System.out.println("After Using Compute By passing New Keys with value: " + map);
		System.out.println("\n");

		// Passing New key and with Null
		String compute4 = map.compute(5, (currentKey, currentValue) -> null);
		System.out.println("Computed Value 4: " + compute4);
		System.out.println("After Using Compute By passing New Keys with Null: " + map);
		System.out.println("================");

		/**
		 * @computeIfPresent default methods work most similar to the compute(), but the
		 *                   difference is it change the value for the key already
		 *                   present in the map object, it will not add the new keys into the map
		 */
		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.put(10, "Java");
		map2.put(20, "Test");
		System.out.println("Before Using computeIfPresent : " + map2);
		System.out.println("\n");
		
		String computeIfPresent = map2.computeIfPresent(20, (currentKey,currentvalue)->currentvalue+" new value");
		System.out.println("Computed Value : " + computeIfPresent);
		System.out.println("After Using computeIfPresent : " + map2);
		System.out.println("\n");
		
		//Passing the old key with null
		String computeIfPresent2 = map2.computeIfPresent(10, (currentKey,currentvalue)->null);
		System.out.println("Computed Value : " + computeIfPresent2);
		System.out.println("After Using computeIfPresent : " + map2);
		System.out.println("\n");
		
		//Passing new key with value
		String computeIfPresent3 = map2.computeIfPresent(30, (currentKey,currentvalue)->currentvalue+" new value");
		System.out.println("Computed Value : " + computeIfPresent3);
		System.out.println("After Using computeIfPresent : " + map2);
		System.out.println("\n");
		
		//Passing new key with null
		String computeIfPresent4 = map2.computeIfPresent(40, (currentKey,currentvalue)->null);
		System.out.println("Computed Value : " + computeIfPresent4);
		System.out.println("After Using computeIfPresent : " + map2);
		System.out.println("\n");
		
		System.out.println("================");
		
		/**
		 * @computIfAbsent default method will add the new key with new value. 
		 * @It wont change the  value of the existing key which has other than null.
		 * @If will change value the of the existing key when the map holds the null for it.  
		 */
		Map<Integer, String> map3 = new LinkedHashMap<>();
		map3.put(4, "Java");
		map3.put(5, null);
		System.out.println("Before Using computIfAbsent : " + map3);
		System.out.println("\n");
		
		//Passing Existing key which has value
		String computeIfAbsent = map3.computeIfAbsent(4, (key)->key+"Test");
		System.out.println("Computed Value : " + computeIfAbsent);
		System.out.println("After Using computeIfAbsent : " + map3);
		System.out.println("\n");
		
		//Passing Existing key which has null value
		String computeIfAbsent2 = map3.computeIfAbsent(5, (key)->key+"Test");
		System.out.println("Computed Value : " + computeIfAbsent2);
		System.out.println("After Using computeIfAbsent : " + map3);
		System.out.println("\n");
		
		//PAssing new key with value
		String computeIfAbsent3 = map3.computeIfAbsent(1, (key)->"Net");
		System.out.println("Computed Value : " + computeIfAbsent3);
		System.out.println("After Using computeIfAbsent : " + map3);
		System.out.println("\n");
		
		//Passing new key with null
		String computeIfAbsent4 = map3.computeIfAbsent(2,  (key)->null);
		System.out.println("Computed Value : " + computeIfAbsent4);
		System.out.println("After Using computeIfAbsent : " + map3);
		System.out.println("\n");
		
		System.out.println("==============");
		
		/**
		 * @Merge default methods
		 */
		
		Map<String,Integer> map4 = new LinkedHashMap<>();
		map4.put("price", 5);
		map4.put("rate", null);
		System.out.println("Before Merge Operation "+map4);
		
		map4.merge("price", 10, Integer::sum);
		System.out.println("After Merge Operation "+map4);
		
		map4.merge("rate", 10, Integer::sum);
		System.out.println("After Merge Operation "+map4);
		

	}

}
