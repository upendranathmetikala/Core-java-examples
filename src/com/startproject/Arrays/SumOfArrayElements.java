package com.startproject.Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] a= {5,6,1,4,5};
		int sum=0;
		String s="";
		for(int i=0;i<a.length; i++) {
			sum+=a[i];
			s+=a[i];
			if(i<a.length-1) s+="+";
		}
		System.out.println("Sum of "+s+" is "+sum);
	}

}
