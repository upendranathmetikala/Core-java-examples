package com.startproject.Strings;

public class Panagram {

	public static void main(String[] args) {
		String s="pack my box with five dozen liquor jugs";
		String s2="";
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)!=' ' && s2.indexOf(s.charAt(i))==-1) {
				s2+=s.charAt(i);
				i++;
			}
			else i++;
		}
		System.out.println(s2);
		if(s2.length()==26) System.out.println("panagram");
		else System.out.println("not panagram");
	}

}
