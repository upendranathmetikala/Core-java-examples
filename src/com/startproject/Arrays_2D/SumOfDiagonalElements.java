package com.startproject.Arrays_2D;

import java.util.Random;

public class SumOfDiagonalElements {

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		Random rand=new Random();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=rand.nextInt(10);
				if(i==j) sum+=a[i][j];
			}
		}
		for(int[] temp:a) {
			for(int n:temp) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of Diagonal Elements in an Array is "+sum);
	}

}
