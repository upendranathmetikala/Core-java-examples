package com.startproject.DoublyLinkedlist;

public class DoublyLinkedlistEx {

	public static void main(String[] args) {
		DoublyLinkedlist dl = new DoublyLinkedlist();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(3,35);
		dl.add(0,5);
		dl.add(1,7);
		System.out.println("Size = " +dl.size());
		System.out.println(dl);
		dl.reverse();
		System.out.println(dl);
		
	}

}
