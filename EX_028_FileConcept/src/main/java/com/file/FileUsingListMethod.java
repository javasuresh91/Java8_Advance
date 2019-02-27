package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUsingListMethod {

	private static Stream<Path> list;
	private static Stream<Path> list2;
	private static Stream<Path> list3;

	public static void main(String[] args) {
		
		try {
			//Fetch all sub-folders/files in the current directory
			list = Files.list(Paths.get("."));
			list.forEach(System.out::println);
			
			System.out.println("=====================");
			
			//Fetch all sub-folders/files one step back from the current directory
			list2 = Files.list(Paths.get("..\\"));
			list2.forEach(System.out::println);
			
			System.out.println("=====================");
			
			//Fetch complete path of sub-folder/files of given path
			list3 = Files.list(Paths.get("E:\\Workspace-Eclipse-Photon\\Java-Workspace\\Java8_Advance\\EX_028_FileConcept"));
			list3.forEach(System.out::println);
			System.out.println("=====================");
			
			//Filtering the Only files for given Path
			Files.list(Paths.get("E:\\Workspace-Eclipse-Photon\\Java-Workspace\\Java8_Advance\\EX_028_FileConcept"))
			.filter(Files::isRegularFile).forEach(System.out::println);
			
			
			//NOTE: In Java current directory means root of the project, not the location of the class file.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
