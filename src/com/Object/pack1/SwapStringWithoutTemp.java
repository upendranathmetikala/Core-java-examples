package com.Object.pack1;

public class SwapStringWithoutTemp {

	public static void main(String[] args) {
		String s1="java";
		String s2="developer";
		s1=s1+s2;
		s2=s1.substring(0,s1.indexOf(s2));
		s1=s1.replace(s2,"");
		System.out.println("String s1 = "+s1);
		System.out.println("String s2 = "+s2);

	}
}
