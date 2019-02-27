package com.file;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileUsingWriteMethod {

	public static void main(String[] args) {
		
		try {
			Path path = Paths.get("test.txt");
			String s= "India is good";
			Path write = Files.write(path, s.getBytes(), StandardOpenOption.WRITE);
			System.out.println(write);
			
			System.out.println("============");
			Path path2 = Paths.get("test.json");
			List<String> list = new ArrayList<>();
			list.add("\"Name\":\"suresh\"");
			list.add("\"age\":27");
			Path write2 = Files.write(path2, list, Charset.forName("UTF-8"), StandardOpenOption.WRITE);
			System.out.println(write2.toUri().getPath());
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
