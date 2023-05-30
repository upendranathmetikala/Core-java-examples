package com.startproject.Applications;
import java.util.Scanner;

class Vegetable{}

class Carrot extends Vegetable{
	public void carrot() {
		System.out.println("Preparation of carrot Halwa");
	}
}

class Potato extends Vegetable{
	public void potato() {
		System.out.println("Preparation of French Fries");
	}
}

class Brinjal extends Vegetable{
	public void brinjal() {
		System.out.println("Preparation of Brinjal Curry");
	}
}

class Capsicum extends Vegetable{
	public void capsicum() {
		System.out.println("Preparation of Capasicum Curry");
	}
}


class ShopKeeper{
	public void selling(String veg) {
		
		if(veg.equalsIgnoreCase("carrot")) {
			Carrot c = new Carrot();
			System.out.println("Carrot is available");
			c.carrot();
			return;
		}
		if(veg.equalsIgnoreCase("potato")) {
			Potato p = new Potato();
			System.out.println("Potato is available");
			p.potato();
			return;
		}
		System.out.println("No sir,"+veg+" is not available");
		
	}
}



public class VegetableShop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What are the vegetable do you want");
		String s=sc.nextLine();
		
		ShopKeeper shopKeeper = new ShopKeeper();
		shopKeeper.selling(s);
	}
}

