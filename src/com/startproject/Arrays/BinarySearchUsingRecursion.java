package com.startproject.Arrays;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7,8,9};
		System.out.println("The element is available at index no :"+search(a,4,0,a.length-1));
		System.out.println("The element is available at index no :"+search(a,9,0,a.length-1));
	}
	static int search(int[] a,int element,int start,int end) {
		if(start>end) return -1;
		int mid=(start+end)/2;
		if(element==a[mid]) return mid;
		else if(element<a[mid]) return search(a,element,start,mid-1);
		else return search(a,element,mid+1,end);
	}
}
