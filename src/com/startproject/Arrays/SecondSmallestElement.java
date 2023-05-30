package com.startproject.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int[] a= {2,2,3,4,6,9,2};
		int smallest=a[0];
		int secondSmallest=a[1];
		for(int i=2;i<a.length;i++) {
			if(a[i]<smallest) smallest=a[i];
			else if(a[i]<secondSmallest || smallest==secondSmallest) {
				if(a[i]!=smallest) secondSmallest=a[i];
			}
		}
		System.out.println("Second Smallest element in an Array is "+secondSmallest);
	}

}
