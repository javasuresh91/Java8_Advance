package com.demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateUsingPeriod {

	/**
	 * @Period is used to represent the date related information like date, month and etc
	 * @period and ChronoUnit will perform the operation on the LocalDate Object for various manipulation on days,month and etc
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate startDate = LocalDate.parse("1991-10-23");
		System.out.println("Start Date : "+startDate);
		System.out.println("================\n");
		/**
		 * Adding days
		 */
		LocalDate plus = startDate.plus(Period.ofDays(5));
		System.out.println(plus);
		
		System.out.println("================\n");
		Period between = Period.between(startDate, LocalDate.now());
		System.out.println("Period Object : "+between);
		int days = Period.between(startDate, LocalDate.now()).getDays();
		System.out.println(days);
		int years = Period.between(startDate, LocalDate.now()).getYears();
		System.out.println(years);
		Period.between(startDate, LocalDate.now()).getUnits().forEach(System.out::println);
		
		System.out.println("================\n");
		
		long between2 = ChronoUnit.DAYS.between(startDate, LocalDate.now());
		System.out.println(between2);
	}

}
