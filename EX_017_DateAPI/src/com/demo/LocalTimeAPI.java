package com.demo;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeAPI {

	/**
	 * @To take current time now() is used, now() is overloaded with three different methods
	 * @ZoneID and Clock can be used for the Supported API of LocalTime
	 * @using of(),now() and parse() to create LocalTime3 and it can be add or minus the Hours , mins and etc
	 * @Comparing Time can be used
	 */
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		Clock systemUTC = Clock.systemUTC();
		Clock systemDefaultZone = Clock.systemDefaultZone();
		LocalTime now2 = LocalTime.now(systemUTC);
		System.out.println(now2);
		LocalTime now3 = LocalTime.now(systemDefaultZone);
		System.out.println(now3);
		
		ZoneId of = ZoneId.of("Europe/Paris");
		LocalTime now4 = LocalTime.now(of);
		System.out.println(now4);
		
		System.out.println("=============\n");
		
		LocalTime parse = LocalTime.parse("13:50");
		System.out.println(parse);
		
		boolean after = LocalTime.parse("13:50").isAfter(LocalTime.of(02, 50));
		System.out.println(after);
		
		boolean before = LocalTime.parse("13:50").isBefore(LocalTime.of(02, 50));
		System.out.println(before);
		
		System.out.println(LocalTime.MIN);
		
		System.out.println("=============\n");
		
		LocalTime of2 = LocalTime.of(13, 45, 55);
		System.out.println(of2);
		
		LocalTime plusHours = LocalTime.of(13, 45, 55).plusHours(2);
		System.out.println(plusHours);
		
		LocalTime minus = LocalTime.of(13, 45, 55).minus(5, ChronoUnit.HOURS);
		System.out.println(minus);
		
		System.out.println(LocalTime.MAX);
		
		System.out.println(LocalTime.MIDNIGHT);
		
	}

}
