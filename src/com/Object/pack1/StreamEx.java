package com.Object.pack1;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		String s1="ilovejava";
		Stream<String> stream = Arrays.stream(s1.split(""));
		Entry<String, Long> collect = stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).findFirst().get();
		System.out.println(collect);
	}

}
