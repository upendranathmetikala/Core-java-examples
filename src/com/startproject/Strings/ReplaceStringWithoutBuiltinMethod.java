package com.startproject.Strings;

public class ReplaceStringWithoutBuiltinMethod {
	public static void main(String[] args) {
		String s1="i love java";
		String replace="love";
		String newreplace="not hate";
		int index=s1.indexOf(replace);
		int length=replace.length();
		String newString=s1.substring(0,index)+newreplace+s1.substring(index+length);
		System.out.println(newString);
	}
}
