package com.startproject.Arrays;

import java.util.Random;

public class Insertionsort {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] a=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(20);
		}
		System.out.println("Before sorting");
		for(int n:a) System.out.print(n+" ");
		insertionsort(a);
	}
	static void insertionsort(int[] a){
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println("\nAfter sorting");
		for(int n:a) System.out.print(n+" ");
	}
}
