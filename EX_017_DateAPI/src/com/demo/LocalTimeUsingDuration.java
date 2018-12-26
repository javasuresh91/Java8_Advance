package com.demo;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalTimeUsingDuration {

	/**
	 * @Duration is used to represent the time related information like Hours,
	 *           Minus, zones and etc
	 * 
	 * @Duration and ChronoUnit will perform the operation on the LocalTime Object
	 *           for various manipulation on Hours, mins and etc
	 * 
	 */
	public static void main(String[] args) {

		LocalTime startTime = LocalTime.of(06, 30, 02);
		System.out.println(startTime);
		System.out.println("==================\n");
		LocalTime now = LocalTime.now();

		System.out.println("==================\n");
		Duration.between(startTime, now).getUnits().forEach(System.out::println);
		System.out.println("==================\n");
		long seconds = Duration.between(startTime, now).getSeconds();
		System.out.println(seconds);
		
		System.out.println("==================\n");
		
		long between = ChronoUnit.HOURS.between(startTime, now);
		System.out.println(between);
		

	}

}
