package com.startproject.Arrays;

import java.util.Random;

public class Selectionsort {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] a=new int[7];
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(10);
		}
		System.out.println("Before sorting");
		for(int n:a) System.out.print(n+" ");
		selectionsort(a);
	}
	static void selectionsort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int small=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[small]) small=j;
			}
			if(small!=i) {
				int temp=a[i];
				a[i]=a[small];
				a[small]=temp;
			}
		}
		System.out.println("\nAfter sorting");
		for(int n:a) System.out.print(n+" ");
	}

}
