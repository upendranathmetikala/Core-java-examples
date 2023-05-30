package com.startproject.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap1 {

	public static void main(String[] args) {
		List<Integer> li1=List.of(5,6,1,2);
		List<Integer> li2=List.of(4,3,9);
		List<Integer> li3=List.of(7,8);
		List<List<Integer>> list = List.of(li1,li2,li3);
		System.out.println(list);
		
		List<Integer> li = list.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(li);
		
		List<Integer> li4=li.stream().flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
		System.out.println(li4);
	}

}
