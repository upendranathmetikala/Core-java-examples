package com.startproject.Arrays_2D;

import java.util.Random;

public class TraversingOfArray {

	public static void main(String[] args) {
		int[][] a=new int[4][4];
		Random rand=new Random();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=rand.nextInt(10);
			}
		}
		display(a);
		System.out.println("********");
		int[][] b=traverse(a);
		display(b);
	}
	static int[][] traverse(int[][] a){
		int[][] b=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[j][i]=a[i][j];
			}
		}
		return b;	
	}
	static void display(int[][] a) {
		for(int[] temp:a) {
			for(int n:temp) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
