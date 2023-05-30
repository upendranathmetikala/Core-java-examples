package com.startproject.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(10);
		}
		System.out.println("Before sorting");
		for(int n:a) System.out.print(n+" ");
		bubblesort(a);
	}
	static void bubblesort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter sorting");
		for(int n:a) System.out.print(n+" ");
	}

}
