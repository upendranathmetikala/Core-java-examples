package com.startpackage.ArrayList;

public class ArraylistEx {

	public static void main(String[] args) {
		Arraylist al=new Arraylist();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.length());
		System.out.println(al.size());
		al.add(3,35);
		System.out.println(al.length());
		System.out.println(al.size());
		System.out.println(al);

	}

}
