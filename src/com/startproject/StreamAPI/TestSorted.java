package com.startproject.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(5);
		li.add(4);
		li.add(8);
		li.add(3);
		li.add(3);
		li.add(1);
		li.add(6);
		List li2=li.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li2);
	}

}
