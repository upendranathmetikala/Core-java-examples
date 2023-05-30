package com.startproject.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7,8,9};
		System.out.println("The element is available at index no :"+search(a,5));
		System.out.println("The element is available at index no :"+search(a,8));
	}
	static int search(int[] a,int element) {
		int start=0,end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(element==a[mid]) return mid;
			else if(element<a[mid]) end=mid-1;
			else start=mid+1;
		}
		return -1;
	}
}
