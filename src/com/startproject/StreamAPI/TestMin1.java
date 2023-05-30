package com.startproject.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMin1 {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(5);
		li.add(4);
		li.add(8);
		li.add(3);
		li.add(3);
		li.add(2);
		li.add(6);
		Integer min=li.stream().min((e1,e2)->e1-e2).get();
		System.out.println(min);

	}

}
