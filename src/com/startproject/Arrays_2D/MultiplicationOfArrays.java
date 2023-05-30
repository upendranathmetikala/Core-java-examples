package com.startproject.Arrays_2D;

public class MultiplicationOfArrays {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{2,3,1},{3,4,1}};
		int[][] b = {{3,1,2},{4,1,2},{1,2,1}};
		display(a);
		System.out.println("********");
		display(b);
		int[][] c = multiply(a,b);
		System.out.println("********");
		display(c);
	}
	static int[][] multiply(int[][] a,int[][] b){
		int[][] c = new int[a.length][b[0].length];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<b.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	return c;	
	}
	static void display(int[][] a){
		for(int[] temp:a) {
			for(int n:temp) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
