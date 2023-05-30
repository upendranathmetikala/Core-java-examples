package com.startproject.Strings;

public class CountStringOccurance {

	public static void main(String[] args) {
		String main="abcbabcabab";
		String sub="bab";
		String result;
		int count=0;
		for(int i=0;i<=main.length()-sub.length();i++) {
			result=main.substring(i,i+sub.length());
			if(result.equals(sub)) count++;
		}
		System.out.println(count);
	}

}
