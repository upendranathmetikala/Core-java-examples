package com.startproject.Strings;

public class RSWUBM {
	public static void main(String[] args) {
		String s1="i love java";
		String s2="not hate";
		String newString="";
		String[] s=s1.split(" ");
		for(int i=0;i<s.length;i++) {
			if(s[i].equals("love")) s[i]=s2;
		}
		for(int i=0;i<s.length;i++) {
			newString+=s[i];
			if(i<s.length-1) newString+=" ";
		}
		s1=newString;
		System.out.println(s1);
	}
}
