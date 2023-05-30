package com.startproject.StreamAPI;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap3 {

	public static void main(String[] args) {
		List<String> a1 = List.of("Monday","Tuesday");
		List<String> a2 = List.of("Wednesday","Thursday");
		List<String> a3 = List.of("Friday","Saturday");
		List<String> a4 = List.of("Sunday");
		List<List<String>> li1 = List.of(a1,a2,a3,a4);
		
		System.out.println(li1);
		
		List<String> li2=li1.stream().flatMap(e->e.stream()).
				flatMap(e->Stream.of((e.toUpperCase()),(e.toLowerCase()))).collect(Collectors.toList());
		
		li2.forEach(System.out::println);
		
		
	}

}
