package com.startproject.Arrays_2D;

public class PascalTriangle {

	public static void main(String[] args) {
		int[][] a=new int[5][5];
		int n=a.length-1;
		for(int j=0;j<a.length;j++) {
			space(n);
			for(int k=0;k<=j;k++) {
				if(j==k || k==0) {
					a[j][k]=1;
					System.out.print(a[j][k]+" "); 
				}
				else{
					a[j][k]=a[j-1][k-1]+a[j-1][k];
					System.out.print(a[j][k]+" ");
				}
			}
			n--;
			System.out.println();
		}
	}
	static void space(int n) {
		for(int j=1;j<=n;j++) {
			System.out.print(" ");
		}
	}
}
