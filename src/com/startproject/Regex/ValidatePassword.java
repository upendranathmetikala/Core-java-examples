package com.startproject.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Password");
		String s=sc.next();
		String ex="(?=.*[A-Z])(?=.*[!@#$%^&*()_+]).{13}";
		Pattern p=Pattern.compile(ex);
		Matcher m=p.matcher(s);
		if(m.matches()) System.out.println(s+" is a valid Password");
		else System.out.println(s+" is not a valid Password");

	}

}
