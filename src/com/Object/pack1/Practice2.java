package com.Object.pack1;

public class Practice2 {

	public static void main(String[] args) {
		String s="ACDB3CFH2";
		String s1="";
		int sum=0;
		for(int k=0;k<s.length();k++) {
			if(s.charAt(k)>=48 && s.charAt(k)<59) {
				sum+=(s.charAt(k)-48);
			}
		}
		for(int i=65;i<91;i++) {
			for(int j=0;j<s.length();j++) {
					if(s.charAt(j)==i) {
						s1+=s.charAt(j);
					}
			}
		}
		System.out.println(s1+""+sum);
	}
}
