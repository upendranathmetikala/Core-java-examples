package com.Object.pack1;

public class ArrayToString {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{8,9,4},{7,6,5}};
		int size=a.length;
		char mov='r';
		int r=0,c=0;
		String s="";
		for(int i=0;i<size*size;i++) {
			if(mov=='r') {
				s+=a[r][c];
				a[r][c++]=0;
				if(c==size-1 || a[r][c+1]==0) mov='d';
			}
			else if(mov=='d') {
				s+=a[r][c];
				a[r++][c]=0;
				if(r==size-1 || a[r+1][c]==0) mov='l';
			}
			else if(mov=='l') {
				s+=a[r][c];
				a[r][c--]=0;
				if(c==0 || a[r][c-1]==0) mov='u';
			}
			else if(mov=='u') {
				s+=a[r][c];
				a[r--][c]=0;
				if(a[r-1][c]==0) mov='r';
			}
		}
		System.out.println(s);

	}

}
