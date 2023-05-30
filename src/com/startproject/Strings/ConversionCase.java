package com.startproject.Strings;

public class ConversionCase {
	public static void main(String[] args) {
		String s1="jaVA DEveLoPer";
		String s2="";
		char a[]=s1.toCharArray();
		for(char arr:a) {
			if(arr>='A' && arr<='Z') s2+=Character.toLowerCase(arr);	
			else if(arr>='a' && arr<='z') s2+=Character.toUpperCase(arr);
			else s2+=arr;
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
