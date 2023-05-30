package com.startproject.Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		if(isPalindrome(s1)) System.out.println(s1+" is a palindrome");
		else System.out.println(s1+" is not a palindrome");
	}
	public static boolean isPalindrome(String s) {
		char[] a=s.toLowerCase().toCharArray();
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
