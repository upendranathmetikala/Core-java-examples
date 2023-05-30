package com.startproject.Arrays;

public class JhonQuicksort {

	public static void main(String[] args) {
		int[] a= {2,4,2,5,6,17,3,8,3,2};
		sort(a,0,a.length-1);
		for(int n:a)
		System.out.print(n+" ");
	}
	static void sort(int[] a,int start,int end) {
		if(start>=end) return;
		int pivot=a[end];
		int i=start;
		int j=end;
		while(i<j) {
			while(a[i]<=pivot && i<j) i++;
			while(a[j]>=pivot && i<j) j--;
			swap(a,i,j);
		}
		swap(a,i,end);
		sort(a,start,i-1);
		sort(a,i+1,end);
	}
	static void swap(int[] a,int i,int j) {
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}

}
