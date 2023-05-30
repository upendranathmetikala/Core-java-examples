package com.startproject.Strings;

public class FirstLetterCapital {

	public static void main(String[] args) {
		String s1="jaVA IS an oop lang.";
		String[] S=s1.split(" ");
		String s2="";
		for(int i=0;i<S.length;i++) {
			char c=S[i].toUpperCase().charAt(0);
			s2+=c;
			s2+=S[i].substring(1,S[i].length()).toLowerCase();
			if(i<S.length-1) s2+=" ";
		}
		System.out.println(s2);
	}

}
