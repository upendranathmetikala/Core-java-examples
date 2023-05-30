package com.startproject.Strings;

import java.util.Scanner;

public class CountOccurances {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		System.out.println("Enter the String to be count");
		String s2=sc.nextLine();
		
		String s3=s1.replace(s2,"");
		int count=(s1.length()-s3.length())/s2.length();
		System.out.println(count);

	}

}
