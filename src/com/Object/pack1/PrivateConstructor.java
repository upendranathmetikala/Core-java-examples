package com.Object.pack1;

class B{
	int i;
	private static B t=null;
	static int count=0;
	private B() {
		i=10;
	}
	public static B getInstance() {
	
		if(t == null) {
			count++;
			t = new B();
		}
		return t;
	}
}


public class PrivateConstructor {

	public static void main(String[] args) {
		B b1 = B.getInstance();
		B b2 = B.getInstance();
				
		System.out.println(b1.i);
		System.out.println(b2.i);
		System.out.println("no of objects "+B.count);
	}

}
