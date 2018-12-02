package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeAPI {

	public static void main(String[] args) {
		ZoneId of = ZoneId.of("Asia/Tokyo");
		System.out.println(of);
		System.out.println("================\n");
//		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//		availableZoneIds.forEach(System.out::println);
		
		ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
		System.out.println(of2);
		System.out.println("================\n");
		LocalDateTime of3 = LocalDateTime.of(2015, Month.FEBRUARY, 20,06,30);
		System.out.println(of3);
		ZoneOffset of4 = ZoneOffset.of("+02:05");
		OffsetDateTime of5 = OffsetDateTime.of(of3, of4);
		System.out.println(of5);
		System.out.println("================\n");

	}

}
