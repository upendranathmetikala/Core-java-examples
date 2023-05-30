package com.startproject.Strings;

public class Anogram {

	public static void main(String[] args) {
		String s1="race";
		String s2="care";
		while(s1.length()!=0 && s2.length()!=0 && s1.length()==s2.length()) {
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"","");
			s2=s2.replace(ch+"","");
		}
		if(s1.length()==0 && s2.length()==0) System.out.println("Anogram");
		else System.out.println("Not anogram");
	}

}
