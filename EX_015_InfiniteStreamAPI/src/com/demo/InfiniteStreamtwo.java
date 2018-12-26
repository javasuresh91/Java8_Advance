package com.demo;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @Inifinte Stream Using Custom type
 *
 */
public class InfiniteStreamtwo {

	public static void main(String[] args) {

		/**
		 * @UUID - It is a custom Class in java, which will give the Random Numeric
		 *       Values
		 */
		Supplier<UUID> randomUUIDs = UUID::randomUUID;
		System.out.println("Static Id (Only one id Will Return)" + randomUUIDs.get());
		System.out.println("=================================");
		
		
		/**
		 * @Stream.generate() will generate multiple UUID
		 */
		Stream<UUID> generate = Stream.generate(randomUUIDs);
//		generate.forEach(System.out::println);
		/**
		 * @skip(10) will skip 10 value from the Above stream
		 * @limit() will restrict to 10 values in the above Stream after the skipping
		 *          the 10 value(i.e.. it will return 11 to 20 values from the above
		 *          stream)
		 */
		List<UUID> collect = generate.skip(10).limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);		
		System.out.println("=================================");
		

	}

}
