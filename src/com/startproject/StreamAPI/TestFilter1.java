package com.startproject.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(4);
		li.add(1);
		li.add(3);
		li.add(11);
		li.add(7);
		li.add(6);
		List<Integer> li2 = li.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(li2);
	}
}
