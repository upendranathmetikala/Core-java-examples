package com.startproject.Arrays_2D;

import java.util.Random;

public class SumOfElements {

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		Random rand=new Random();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=rand.nextInt(10);
				sum+=a[i][j];
			}
		}
		System.out.println("Sum of Elements in an array is "+sum);
	}

}
