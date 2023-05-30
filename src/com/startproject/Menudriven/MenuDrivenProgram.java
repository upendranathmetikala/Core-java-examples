package com.startproject.Menudriven;

import java.util.Scanner;
public class MenuDrivenProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("1.Length of given number\n2.Factorial of given number\n3.Power of given number\n4.Armstrong number or not\n5.Strong number or not\n6.Armstrong number in a range\n7.Strong number in a range\n"
				+ "8.Nivin Number or not\n9.Automorphic number or not\n10.Magic number or not\n11.prime number\n12.prime number in a given range\n13.Fibonaci Series\n14.Fibonaci Series in a range\n15.Pattern1\n16.Pattern2\n17.Pattern3"
				+ "\n18.Largest of three numbers");
		System.out.println("Enter Your Choice");
		int choice=scn.nextInt();
		if(choice==1) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			System.out.println("Length of given number is "+Utility.length(num));
		}
		else if(choice==2) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			System.out.println("Factorial of given number is "+Utility.factorial(num));
		}
		else if(choice==3) {
			System.out.println("Enter a base number");
			int base=scn.nextInt();
			System.out.println("Enter a exponential number");
			int exp=scn.nextInt();
			System.out.println("power of given number is "+Utility.power(base,exp));
		}
		else if(choice==4) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			int result=Utility.armstrong(num);
			if(result==num)System.out.println(num+" is an armstrong number");
			else System.out.println(num+" is not an armstrong number");
		}
		else if(choice==5) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			int result=Utility.strong(num);
			if(result==num)System.out.println(num+" is a strong number");
			else System.out.println(num+" is not a strong number");
		}
		else if(choice==6) {
			System.out.println("Enter a range");
			int range=scn.nextInt();
			for(int i=1;i<=range;i++) {
				int result=Utility.armstrong(i);
				if(result==i) System.out.println(i);
			}
		}
		else if(choice==7) {
			System.out.println("Enter a range");
			int range=scn.nextInt();
			for(int i=1;i<=range;i++) {
				int result=Utility.strong(i);
				if(result==i) System.out.println(i);
			}
		}
		else if(choice==8) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
			int result=Utility.nivinNumber(num);
			if(num%result==0)System.out.println(num+" is a Nivin number");
			else System.out.println(num+" is not a Nivin number");
			}
		}
		else if(choice==9) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
			int result=Utility.automorphicNumber(num);
			if(result==num)System.out.println(num+" is a Automorphic number");
			else System.out.println(num+" is not a Automorphic number");
			}
		}
		else if(choice==10) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
			int result=Utility.magicNumber(num);
			if(result==num)System.out.println(num+" is a Magic number");
			else System.out.println(num+" is not a Magic number");
			}
		}
		else if(choice==11) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
			boolean result=Utility.prime(num);
			if(result)System.out.println(num+" is a prime number");
			else System.out.println(num+" is not a prime number");
			}
		}
		else if(choice==12) {
			System.out.println("Enter low range");
			int a=scn.nextInt();
			System.out.println("Enter high range");
			int b=scn.nextInt();
			if(a<0)System.out.println("No negatives");
			else {
				for(int i=a;i<=b;i++) {
					boolean result=Utility.prime(i);
					if(result)System.out.println(i);
				}
			}
		}
		else if(choice==13) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
			Utility.fibonaciSeries(num);
			}
		}
		else if(choice==14) {
			System.out.println("Enter low range");
			int a=scn.nextInt();
			System.out.println("Enter high range");
			int b=scn.nextInt();
			if(a<0)System.out.println("No negatives");
			else {
					Utility.fibonaciSeriesRange(a,b);
			}
		}
		else if(choice==15) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
					Utility.pattern1(num);
			}
		}
		else if(choice==16) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
					Utility.pattern2(num);
			}
		}
		else if(choice==17) {
			System.out.println("Enter a number");
			int num=scn.nextInt();
			if(num<0)System.out.println("No negatives");
			else {
					Utility.pattern3(num);
			}
		}
		else if(choice==18) {
			System.out.println("enter first number");
			int a=scn.nextInt();
			System.out.println("enter second number");
			int b=scn.nextInt();
			System.out.println("enter third number");
			int c=scn.nextInt();
			System.out.println(Utility.Larger(a,b,c)+" is a Larger number among Given three numbers");		
		}
		else
		System.out.println("invalid input\nThat's ok, please try again");
		System.out.println("Do You Want To Continue click Y/N");
		char ch=scn.next().charAt(0);
		if(ch=='Y' || ch=='y') {
			continue;
		}
		break;
	}
	System.out.println("Thank you for using the software.\nVisit Again.");
}
}

