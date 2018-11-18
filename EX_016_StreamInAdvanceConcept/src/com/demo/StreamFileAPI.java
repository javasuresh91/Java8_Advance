package com.demo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 
 * @java.nio package take care of File handling in Stream @Paths.get() gives the
 *           path object of the dir string passed into it.
 * @line() in the Files class will take the each line in the file as a Stream
 *         Element and return the file as a Stream Object and, path object will
 *         be the argument of the line()
 * @Along with path object we can send charset arguments into the line()
 *
 */
public class StreamFileAPI {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("myFile.txt");
		Stream<String> lines = Files.lines(path);
		lines.forEach(System.out::println);
		System.out.println("=========================================");
		Stream<String> lines2 = Files.lines(path, Charset.forName("UTF-8"));
		lines2.forEach(System.out::println);
		

	}

}
