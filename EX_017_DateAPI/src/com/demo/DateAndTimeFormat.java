package com.demo;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateAndTimeFormat {
	
	/**
	 * @By default the  date and time is formatted by ISO format 
	 * 
	 * @DateTimeFormatter Class will used to format the date and time
	 */
	public static void main(String[] args) {

		LocalDateTime of = LocalDateTime.of(2015, Month.JANUARY, 05, 06, 30);
		System.out.println("Before Formatting : "+of);
		System.out.println("================\nAfter Formating \n");
		String format = of.format(DateTimeFormatter.ISO_DATE);
		System.out.println("ISO Format Date "+format);
		String format2 = of.format(DateTimeFormatter.ofPattern("DD/MM/yyyy"));
		System.out.println("Customise Format : "+format2);
		String format3 = of.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		System.out.println("Short Format : "+format3);
		
		String format4 = of.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.CANADA));
		System.out.println("Formmated With Locale : "+format4);
		System.out.println("================\n ");
		
	}

}
