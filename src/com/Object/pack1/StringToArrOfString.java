package com.Object.pack1;

public class StringToArrOfString {

	public static void main(String[] args) {
		String s="i like java";
		int space=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') space++;
		}
		String[] arr=new String[space+1];
		int j=0;
		int index=0;
		String t="";
		while(j<s.length()) {
			if(s.charAt(j)!=' ') {
				t+=s.charAt(j++);
			}
			else {
				arr[index++]=t;
				j++;
				t="";
			}
		}
		arr[index]=t;
		for(String s1:arr) {
			System.out.println(s1);
		}
	}

}
