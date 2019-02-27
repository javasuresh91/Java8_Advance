package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileUsingLineMethod {

	private static Stream<String> lines;
	private static Stream<String> lines2;
	private static Stream<String> lines3;
	private static Stream<String> lines4;

	public static void main(String[] args) {
		
		Path path = Paths.get("data.txt");
		try {
			//Read all the lines
			lines = Files.lines(path);
			lines.forEach(System.out::println);
			System.out.println("===================");
			
			
			lines2 = Files.lines(path);
			//Read the First Line
			Optional<String> findFirst = lines2.findFirst();
			System.out.println(findFirst.get());
			System.out.println("===================");
			
			lines3 = Files.lines(path);
			//Fetch the content match to the filter condition
			lines3.filter(s->s.contains("Line 2")).forEach(System.out::println);
			System.out.println("===================");
			
			lines4 = Files.lines(path);
			//Fetch the content match to the filter condition and return the first occurrence
			Optional<String> findFirst2 = lines4.filter(s->s.contains("Line 2")).findFirst();
			System.out.println(findFirst2.get());
			System.out.println("===================");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
