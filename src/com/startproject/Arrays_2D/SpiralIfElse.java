package com.startproject.Arrays_2D;

import java.util.Scanner;

public class SpiralIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[][] a=new int[size][size];
		char mov='r';
		int row=0,col=0;
		for(int i=1;i<=size*size;i++) {
			if(mov=='r') {
				a[row][col++]=i;
				if(col>=size-1 || a[row][col+1]!=0) mov='d';
			}else if(mov=='d') {
				a[row++][col]=i;
				if(row>=size-1 || a[row+1][col]!=0) mov='l';
			}else if(mov=='l') {
				a[row][col--]=i;
				if(col==0 || a[row][col-1]!=0) mov='u';
			}else if(mov=='u') {
				a[row--][col]=i;
				if(a[row-1][col]!=0) mov='r';
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==0) System.out.print(a[i][j]+"  ");
				else System.out.print(a[i][j]+" ");
			}
		System.out.println();
		System.out.println();
		}
	}

}
