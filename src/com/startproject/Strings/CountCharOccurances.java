package com.startproject.Strings;

import java.util.Scanner;

public class CountCharOccurances {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine().toLowerCase();
		char c;
		int count;
		while(s1.length()>0) {
			c=s1.charAt(0);
			String s2=s1.replace(c+"","");
			count=s1.length()-s2.length();
			System.out.println(c+" occurances is "+count);
			s1=s2;
		}
	}
}
