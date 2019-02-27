package com.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUsingFindMethod {

	public static void main(String[] args) {
		Path path = Paths.get(".");
		try {
			
			/**
			 * @1st parameter - path object
			 * @2nd parameter - how much depth go and search 
			 * @3rd parameter - bipredicate function used to set the condition on which search should return 
			 */
			Stream<Path> find = Files.find(path, 2, (paths,bi)->String.valueOf(paths).endsWith(".json"));
			find.map(Path::getFileName).forEach(System.out::println);
			System.out.println("=================");
			Stream<Path> find2 = Files.find(path, 2, (paths,bi)->String.valueOf(paths).endsWith(".js"));
			find2.map(Path::getFileName).forEach(System.out::println);
			System.out.println("=================");
			Stream<Path> find3 = Files.find(path, 2, (paths,bi)->String.valueOf(paths).endsWith(".txt"));
			find3.map(Path::getFileName).forEach(System.out::println);
			System.out.println("=================");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
