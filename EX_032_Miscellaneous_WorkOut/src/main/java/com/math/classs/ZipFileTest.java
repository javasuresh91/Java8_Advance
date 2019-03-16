package com.math.classs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFileTest {

	public static void main(String[] args) {
		try(ZipFile zipFile = new ZipFile("first.zip")) {
			
			Stream<? extends ZipEntry> stream = zipFile.stream();
			stream.forEach(System.out::println);
			System.out.println("=============================");
			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry zipEntry = (ZipEntry) entries.nextElement();
				System.out.println(zipEntry.getName());
				InputStream inputStream = zipFile.getInputStream(zipEntry);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				bufferedReader.lines().forEach(System.out::println);
				System.out.println("----------------------------------------");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
