package com.startproject.Menudriven;

import java.util.Scanner;
public class Utility {
	public static int length(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static long factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	public static int power(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power*=base;
		}
		return power;
	}
	public static int armstrong(int num) {
		int length=length(num);
		int sum=0;
		while(num>0) {
			int dig=num%10;
			sum+=power(dig,length);
			num/=10;
		}
		return sum;
	}
	public static int strong(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			long fact=factorial(rem);
			sum+=fact;
			num/=10;
		}
		return sum;
	}
	public static int nivinNumber(int num) {
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		return sum;
	}
	public static int automorphicNumber(int num) {
		int length=length(num);
		int sqrtnum=power(num,2);
		int result=sqrtnum%power(10,length);
		return result;
	}
	public static int magicNumber(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		int rev=0;
		int temp=sum;
		while(temp>0) {
			int rem1=temp%10;
			rev=rev*10+rem1;
			temp/=10;
		}
		int result=sum*rev;
		return result;
	}
	public static boolean prime(int num) {
		if(num<=1) {
			return false;
		}
		for(int j=2;j<=num/2;j++) {
			if(num%j==0)
			return false;
		}
		return true;
	}
	public static void fibonaciSeries(int num) {
		int c=0;
		int a=0;
		int b=1;
		for(int j=1;j<=num;j++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void fibonaciSeriesRange(int l,int h) {
		int c=0;
		int a=0;
		int b=1;
		for(;true;) {
			if(a>h) break;
			if(a>=l)
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void pattern1(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				String value=(i==j)?"*":""+(num-j+1)+"";
				System.out.print(value);
			}
			System.out.println();
		}
	}
	public static void pattern2(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				String value=(j<=num-i)?"*":"#";
				System.out.print(value);
			}
			System.out.println();
		}
	}
	public static void pattern3(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				int value=(j<=num-i+1)?i+j-1:i+j-num-1;
				System.out.print(value);
			}
			System.out.println();
		}
	}
	public static int Larger(int a,int b,int c) {
		int result=(a>b && a>c)?a:((b>c)?b:c);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		pattern3(num);
	}
}
