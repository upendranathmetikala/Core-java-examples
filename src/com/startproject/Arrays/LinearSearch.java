package com.startproject.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {4,2,1,3,4,7,8};
		System.out.println("The element is available at index no :"+search(a,3));
		System.out.println("The element is available at index no :"+search(a,9));
	}
	static int search(int[] a,int element) {
		for(int i=0;i<a.length;i++) {
			if(element==a[i]) return i;
		}
		return -1;
	}
}
