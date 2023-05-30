package com.startproject.Regex;

public class Demo1 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int sum=0;
		String s="";
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			s+=a[i];
			if(i<a.length-1) s+="+";
		}
		System.out.println("Addition of "+s+" is "+sum);
	}

}
