package com.startproject.Arrays;

public class ReverseElements {

	public static void main(String[] args) {
		int[] a= {9,5,3,4,2,6,7,1};
		int i=0,j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int n:a) System.out.println(n);
	}

}
