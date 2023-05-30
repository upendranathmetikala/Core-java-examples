package com.Object.pack1;

class A{
	private int num;

	public int get() {
		return num;
	}
	public void set(int num) {
		this.num=num;
	}
	public int fact() {
		int fact=1;
		for(int i=1;i<=num;i++) fact*=i;
		return fact;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		int num=5;
		A a = new A();
		a.set(num);
		System.out.println("factorial of "+a.get()+" is = "+a.fact());

	}

}
