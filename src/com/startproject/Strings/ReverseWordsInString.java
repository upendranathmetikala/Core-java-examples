package com.startproject.Strings;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String s1="java is an oop lang";
		String s2="";
		char[] a = s1.toCharArray();
		int j=0, i=j;
		while(j<a.length) {
			while(j<a.length && a[j]!=' ') j++;
				int k=j-1;
				while(k>=i) {
					s2 += a[k];
					k--;
				}
				if(j<a.length) s2+=" ";
				j++;
				i=j;
		}
		System.out.println(s2);
	}

}
