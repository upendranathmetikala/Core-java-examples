package com.Object.pack1;

public class Practice
{
	public static void main(String[] args) {
		int[] a= {2,3,1,5,3,8,9,4};
		for(int n:a) System.out.print(n+" ");
		System.out.println();
		sort(a,0,a.length-1);
		
	}
	static void sort(int[] a,int i,int j) {
		if(i>=j) return;
		int low=i;
		int high=j-1;
		int pivot=a[j];
		while(low<high) {
			while(a[low]<pivot && low<high) low++;
			while(a[high]>pivot && low<high) high--;
			swap(a,low,high);
		}
		swap(a,low,j);
		for(int n:a) System.out.print(n+" ");
		System.out.println();
		sort(a,i,low-1);
		sort(a,low+1,j);
	}
	static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}



