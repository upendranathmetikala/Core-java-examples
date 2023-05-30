package com.startproject.Strings;

public class Encoding {

	public static void main(String[] args) {
		String s1="java";
		String s2="";
		int n=2;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)+n>'z') s2+=(char)(s1.charAt(i)+n-26);
			else s2+=(char)(s1.charAt(i)+n);
		}
		System.out.println(s2);
	}

}
