package com.demo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.pojo.Detail;

public class StreamOne {
	/**
	 * 
	 * @Convert the Stream elements into another stream using special functions 
	 * @map() - use to manipulate the stream elements and return in the desire type
	 * @flatMap()
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("path");
		list.add("methods");
		list.add("sun");
		list.add("sarcasm");

		Stream<Path> map = list.stream().map(li -> Paths.get(li));
		map.forEach(System.out::println);

		System.out.println("-----------");

		List<Detail> detailList = new ArrayList<>();
		detailList.add(new Detail(1001, Arrays.asList("1", "2", "3")));
		detailList.add(new Detail(1002, Arrays.asList("4", "5", "6")));
		detailList.add(new Detail(1003, Arrays.asList("7", "8", "9")));

		Stream<String> innerListStream = detailList.stream().flatMap(details -> {
			return details.getParts().stream();
		});

		System.out.println("Inner List Iteration");
		innerListStream.forEach(System.out::println);
	}

}
