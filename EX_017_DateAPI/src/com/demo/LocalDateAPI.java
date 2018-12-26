package com.demo;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateAPI {

	public static void main(String[] args) {
		
		/**
		 * @LocalDate is a thread safe.
		 * @To take current date now() is used, now() is overloaded with three different methods
		 * @ZoneID and Clock can be used for the Supported API of LocalDate
		 * @using of(),now() and parse() to create LocalDate and it can be add or minus the dates , months ,week, years and etc
		 * @Comparing Dates can be used
		 */
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		Clock systemDefaultZone = Clock.systemDefaultZone();
		LocalDate now2 = LocalDate.now(systemDefaultZone);
		System.out.println(now2);
		
		ZoneId of = ZoneId.of("Europe/Paris");
		LocalDate now3 = LocalDate.now(of);
		System.out.println(now3);
		
		System.out.println("=====================\n");
		
		LocalDate of2 = LocalDate.of(1991, 10, 23);
		System.out.println(of2);
		
		LocalDate parse = LocalDate.parse("1991-05-23");
		System.out.println(parse);
		LocalDate plusDays = parse.plusDays(2);
		System.out.println(plusDays);
		LocalDate minusMonths = parse.minusMonths(5);
		System.out.println(minusMonths);
		LocalDate minus = parse.minus(2, ChronoUnit.YEARS);
		System.out.println(minus);
		
		System.out.println("=====================\n");
		
		//To get the Day and month and week and etc
		Month month = LocalDate.parse("1994-10-25").getMonth();
		System.out.println(month);
		int dayOfMonth = LocalDate.parse("1994-10-25").getDayOfMonth();
		System.out.println(dayOfMonth);
		DayOfWeek dayOfWeek = LocalDate.parse("1994-10-25").getDayOfWeek();
		System.out.println(dayOfWeek);
		
		System.out.println("=====================\n");
		
		boolean leapYear = LocalDate.parse("1994-10-25").isLeapYear();
		System.out.println(leapYear);
		
		boolean leapYear2 = LocalDate.now().plusYears(2).isLeapYear();
		System.out.println(leapYear2);
		
		System.out.println("=====================\n");
		
		boolean before = LocalDate.parse("1994-10-25").isBefore(LocalDate.now());
		System.out.println(before);
		
		boolean after = LocalDate.parse("1994-10-25").isAfter(LocalDate.now());
		System.out.println(after);
		
		System.out.println("=====================\n");
		LocalDateTime atStartOfDay = LocalDate.parse("1994-10-25").atStartOfDay();
		System.out.println(atStartOfDay);
		
		LocalDate with = LocalDate.parse("1994-10-25").with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(with);
		
		LocalDate withDayOfMonth = LocalDate.parse("1994-10-25").withDayOfMonth(2);
		System.out.println(withDayOfMonth);
	}

}
