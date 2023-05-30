package com.Object.pack1;

public class Practice3 {
	public static void main(String[] args) {	
		int[] arr= {1,1,2,2,3,4,4,4,4,4,5,5};
		String s="";
		int count=0;
		int elecount=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) elecount++;
			else {
				if(elecount>count) {
					s=arr[i]+"";
					count=elecount;
				}
				elecount=1;
			}
		}
		System.out.println("maximum length of consecutive substring arr element is "+s+" and count "+count);
	}
}
