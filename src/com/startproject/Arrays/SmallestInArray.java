package com.startproject.Arrays;

public class SmallestInArray {

	public static void main(String[] args) {
		int[] a= {8,1,5,2,1,6};
		int smallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest) smallest=a[i];
		}
		System.out.println("Smallest element in an Array is "+smallest);
	}

}
