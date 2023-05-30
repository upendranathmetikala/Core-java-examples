package com.startproject.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		int[] a= {4,7,9,1,2,3,7,2};
		for(int n:a) System.out.print(n+" ");
		System.out.println();
		sort(a,0,a.length-1);
		for(int n:a) System.out.print(n+" ");
	}
	static void sort(int[] a,int start,int end) {
		if(start>=end) return;
		
		int pivot=a[(start+end)/2];
		int i=start;
		int j=end;
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}

}
