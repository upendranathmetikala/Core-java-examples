package com.startproject.Linkedlist;

public class LinkedlistEx {

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(1,15);
		l.add(3,25);
		l.remove(4);
		l.add(40);
		System.out.println(l);
		l.add(0,5);
		System.out.println(l);
	}

}
