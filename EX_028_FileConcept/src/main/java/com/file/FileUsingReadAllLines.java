package com.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileUsingReadAllLines {

	public static void main(String[] args) {
		try {
		
			readAllLinesImpl();
			bufferedReaderImpl();
			
			//NOTE: We have methods for writing the content in the file as reading
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

	private static void bufferedReaderImpl() throws IOException {
		System.out.println("Buffered Reader \n =========================");
		/**
		 * @Buffered Reader is also used to read the file lines with same overload methods of charset
		 * @It will be faster while comparing to the readAllLines()
		 */
		BufferedReader newBufferedReader = Files.newBufferedReader(Paths.get("data.txt"));
		Stream<String> lines = newBufferedReader.lines();
		lines.forEach(System.out::println);
		
		System.out.println("=====================");
		BufferedReader newBufferedReader2 = Files.newBufferedReader(Paths.get("data.txt"),Charset.forName("UTF-16"));
		Stream<String> lines2 = newBufferedReader2.lines();
		lines2.forEach(System.out::println);
		System.out.println("=====================");
		
		
	}

	private static void readAllLinesImpl() throws IOException {
		/**
		 * @readAllLine method read the all lines in the file as byte and using charset internally, it returns as Character(List of String)
		 */
		List<String> readAllLines = Files.readAllLines(Paths.get("data.txt"));
		readAllLines.stream().forEach(System.out::println);
		
		System.out.println("=====================");
		
		List<String> readAllLines2 = Files.readAllLines(Paths.get("data.txt"),Charset.forName("UTF-16"));
		readAllLines2.stream().forEach(System.out::println);
		
		System.out.println("=====================");
	}

}
