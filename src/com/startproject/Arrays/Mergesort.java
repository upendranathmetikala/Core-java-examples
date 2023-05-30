package com.startproject.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		int[] a= {9,5,3,4,6,1,2,7,1,8,10};
		System.out.print("Before sorting : ");
		for(int n:a) System.out.print(n+" ");
		split(a);
		System.out.print("\nAfter sorting : ");
		for(int m:a) System.out.print(m+" ");
	}
	static void split(int[] a) {
		if(a.length==1) return;
		int[] left = new int[a.length/2];
		int[] right = new int[a.length-left.length];
		int i=0, j=0;
		while(i<left.length) left[i] = a[i++];
		while(j<right.length) right[j++] = a[i++];
		split(left);
		split(right);
		mergesort(left,right,a);
	}
	private static void mergesort(int[] a,int[] b,int[] c) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++]=a[i++];
			else c[k++]=b[j++];
		} 
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
	}

}
