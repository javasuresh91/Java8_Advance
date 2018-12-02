package com.demo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CompatibilityOldDateAndCalender {

	/**
	 * 
	 * @Using ofInstant(****) method in the LocalDateTime Class, the Old date and
	 *        Calendar object can be converted to the New Date Object
	 */
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Old date : " + d);
		LocalDateTime ofInstant = LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
		System.out.println("New Date : " + ofInstant);
		
		System.out.println("============================\n");
		
		Calendar cal = Calendar.getInstance();
		System.out.println("Old Calendar : "+cal);
		
		LocalDateTime ofInstant2 = LocalDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
		System.out.println("New Calendar : "+ofInstant2);

	}

}
