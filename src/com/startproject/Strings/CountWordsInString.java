package com.startproject.Strings;

public class CountWordsInString {

	public static void main(String[] args) {
		String s1="i love java i love python";
		String[] a=s1.split(" ");
		int count=1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					a[j]="";
					count++;
				}
			}
			if(a[i]!="") System.out.println(a[i]+" "+count);
			count=1;
		}

	}

}
