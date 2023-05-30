package com.startproject.Strings;

public class ReverseString {

	public static void main(String[] args) {
		String s1="java is an oop lang";
		String s2="";
		char[] a = s1.toCharArray();
		int j=a.length-1, i=j;
		while(j>=0) {
			while(j>=0 && a[j]!=' ') j--;
				int k=j+1;
				while(k<=i) {
					s2 += a[k];
					k++;
				}
				j-=1;
				i=j;
				if(j>0) s2+=" ";
		}
		System.out.println(s2);
	}

}
