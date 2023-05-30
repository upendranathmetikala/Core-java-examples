package com.startproject.StreamAPI;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap1 {
	public static void main(String[] args) {
		List<Integer> li = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> li2 = li.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(li2);
		
		Function f=new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				t=t*t;
				return t;
			}


		};
	}
}
