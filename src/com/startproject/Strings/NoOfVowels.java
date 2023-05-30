package com.startproject.Strings;

public class NoOfVowels {

	public static void main(String[] args) {
		String s1="java";
		char a[]=s1.toLowerCase().toCharArray();
		int count=0;
		for(char arr:a) {
			if(arr=='a' || arr=='e' || arr=='i' || arr=='o' || arr=='u') count++;
		}
		System.out.println(count);
	}
}
