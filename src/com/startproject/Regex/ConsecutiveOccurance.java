package com.startproject.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsecutiveOccurance {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("([a-z])\\1*");
		Matcher m=p.matcher("aabbbbccd");
		String s="";
		while(m.find()) {
			String temp=m.group();
			s=s+temp.charAt(0)+temp.length();
		}
		System.out.println(s);
	}

}
