package com.file;

import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUsingWalkMethod {

	public static void main(String[] args) {
		try {
			
			Path path = Paths.get(".\\");
			Stream<Path> walk = Files.walk(path, Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS);
			walk.forEach(System.out::println);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
