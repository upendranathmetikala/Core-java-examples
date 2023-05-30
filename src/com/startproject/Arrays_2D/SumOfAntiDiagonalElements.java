package com.startproject.Arrays_2D;

import java.util.Random;

public class SumOfAntiDiagonalElements {

	public static void main(String[] args) {
		int[][] a=new int[4][4];
		Random rand=new Random();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=rand.nextInt(10);
			}
		}
		for(int[] temp:a) {
			for(int n:temp) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j || j==a.length-1-i) sum+=a[i][j];
			}
		}
		System.out.println("Sum of Anti-Diagonal Elements in an Array is "+sum);
	}
}
