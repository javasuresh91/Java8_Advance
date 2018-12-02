package com.demo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTimeAPI {

	/**
	 * @This is combination of LocalTime and LocalDate and we can do all functions
	 *       which are used in the the LoaclDate and LocalTime
	 * @It has lot of factory methods and Overloaded methods which help us to have
	 *     different operation on this API
	 */
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		Clock systemUTC = Clock.systemUTC();
		Clock systemDefaultZone = Clock.systemDefaultZone();
		LocalDateTime now2 = LocalDateTime.now(systemDefaultZone);
		System.out.println(now2);
		LocalDateTime now3 = LocalDateTime.now(systemUTC);
		System.out.println(now3);

		System.out.println("============\n");

		LocalDateTime of = LocalDateTime.of(LocalDate.parse("1994-10-25"), LocalTime.now());
		System.out.println(of);

		System.out.println("============\n");

		LocalDateTime parse = LocalDateTime.parse("1996-10-25T13:22");
		System.out.println(parse);
		System.out.println(parse.toLocalDate());
		System.out.println(parse.toLocalTime());

		System.out.println("============\n");

		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.MIN);

	}

}
