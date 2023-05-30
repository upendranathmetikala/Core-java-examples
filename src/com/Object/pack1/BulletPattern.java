package com.Object.pack1;

public class BulletPattern {
	public static void main(String[] args) {
		int size=5;
		int[][] a=new int[2*size-1][size];
		for(int j=0;j<size;j++) {
			for(int i=0;i<2*size-1;i++) {
				if(i==0 && j==0) {
					a[i][j]=1;
				}
				else if(j==0 && i==2*size-j-2) {
					a[i][j]=2;
				}
				else if(i<=size && i==j) {
					a[i][j]=a[i-1][j-1]+a[2*size-j-1][j-1];
				}
				else if(i==2*size-j-2 && i>=size) {
					a[i][j]=a[i+1][j-1]+a[2*size-i-2][j];
				}
			}
		}
		for(int i=0;i<2*size-1;i++) {
			for(int j=0;j<size;j++) {
				if(i==j || i==2*size-j-2) System.out.print(a[i][j]+" ");
				else System.out.print("   ");
			}
			System.out.println();
		}
	}
}
