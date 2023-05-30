package com.Object.pack1;
import java.util.Scanner;

class USAcafe{
	int totalamount;
	String item;
	public static void Pos() {
		
		System.out.println("Idly = 111");
		System.out.println("Vada = 112");
		System.out.println("Dosa = 113");
		System.out.println("Roti = 121");
		System.out.println("Butternon = 122");
		System.out.println("Chapati = 123");
		System.out.println("ChickenFry = 211");
		System.out.println("EggCurry = 212");
		System.out.println("ChickenBiryani = 213");
		System.out.println("Chicken Chettinaad = 221");
		System.out.println("Chepala Iguru = 222");
		System.out.println("Kadai Chicken = 223");
		System.out.println("Gobi = 31");
		System.out.println("Noodles = 32");
		System.out.println("Egg Gobi = 33");
		System.out.println("Spicy Rice Cakes = 41");
		System.out.println("Kimbap = 42");
		System.out.println("Fish Pastries = 43");
		System.out.println("Fruit Juice = 51");
		System.out.println("Coffee = 52");
		System.out.println("Tea = 53");
		System.out.println("Coco Cola = 54");
	}
	public void idly() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates od Item");
		int n=sc.nextInt();
		totalamount+=n*15;
		item+="Idly----"+n+" plates-----------"+(n*15)+" Rs\n";
	}
	public void vada() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates od Item");
		int n=sc.nextInt();
		totalamount+=n*25;
		item+="Vada----"+n+" plates-----------"+(n*25)+" Rs\n";
	}
	public void dosa() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates od Item");
		int n=sc.nextInt();
		totalamount+=n*45;
		item+="Dosa----"+n+" plates-----------"+(n*45)+" Rs\n";
	}
	public void roti() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates od Item");
		int n=sc.nextInt();
		totalamount+=n*10;
		item+="Roti----"+n+" plates-----------"+(n*10)+" Rs\n";
	}
	public void butternon() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates od Item");
		int n=sc.nextInt();
		totalamount+=n*15;
		item+="Butternon----"+n+" plates------"+(n*15)+" Rs\n";
	}
	public void chapati() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates od Item");
		int n=sc.nextInt();
		totalamount+=n*25;
		item+="Chapati----"+n+" plates---------"+(n*25)+" Rs\n";
	}
	public void chickenfry() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates od Item");
		int n=sc.nextInt();
		totalamount+=n*80;
		item+="Chickenfry----"+n+" plates------"+(n*80)+" Rs\n";
	}
	public void eggcurry() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*65;
		item+="Eggcurry----"+n+" plates--------"+(n*65)+" Rs\n";
	}
	public void chickenBiryani() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*110;
		item+="Chicken Biryani----"+n+" plate--"+(n*110)+" Rs\n";
	}
	public void chickenChettinaad() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*90;
		item+="Chicken Chettinaad--"+n+" plates--"+(n*90)+" Rs\n";
	}
	public void chapalaIguru() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*80;
		item+="Chapala Iguru----"+n+" plates-----"+(n*80)+" Rs\n";
	}
	public void kadaiChicken() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*85;
		item+="KadaiChicken----"+n+" plates------"+(n*85)+" Rs\n";
	}
	public void gobi() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*50;
		item+="Gobi----"+n+" plates--------------"+(n*50)+" Rs\n";
	}
	public void noodles() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*40;
		item+="Noodels----"+n+" plates-----------"+(n*40)+" Rs\n";
	}
	public void eggGobi() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*40;
		item+="Egg Gobi----"+n+" plates----------"+(n*40)+" Rs\n";
	}
	public void spicyRiceCakes() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*50;
		item+="Spicy Rice Cakes----"+n+" plates----"+(n*50)+" Rs\n";
	}
	public void kimbap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*80;
		item+="Kimbap----"+n+" plates-----------"+(n*80)+" Rs\n";
	}
	public void fishPastries() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Plates of Item");
		int n=sc.nextInt();
		totalamount+=n*70;
		item+="Fish Pastries----"+n+" plates=-----"+(n*70)+" Rs\n";
	}
	public void fruitJuice() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Juices");
		int n=sc.nextInt();
		totalamount+=n*30;
		item+="Fruit Juice----"+n+" no's----------"+(n*30)+" Rs\n";
	}
	public void coffee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Cups");
		int n=sc.nextInt();
		totalamount+=n*15;
		item+="Cofee----"+n+" no's--------------"+(n*15)+" Rs\n";
	}	
	public void tea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Cups");
		int n=sc.nextInt();
		totalamount+=n*10;
		item+="Tea----"+n+" no's----------------"+(n*10)+" Rs\n";
	}
	public void cocaCola() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Drinks");
		int n=sc.nextInt();
		totalamount+=n*45;
		item+="Coca Cola----"+n+" no's----------"+(n*45)+" Rs\n";
	}
	public void receipt() {
		System.out.println("\nRECEIPT\n---------------------------------------------");
		System.out.println(item+"---------------------------------------------");
		System.out.println("Total Amount of Items Is "+totalamount+"\n---------------------------------------------");
		System.out.println("Total Tax Is 12% Of Total Amount.");
		System.out.println("---------------------------------------------");
		double b=0.06*totalamount;
		System.out.println("CGST Is 6% Of Total Amount Is "+b+" Rs");
		double c=0.06*totalamount;
		System.out.println("SGST Is 6% Of Total Amount Is "+c+" Rs");
		System.out.println("---------------------------------------------\nGrand Total Amount Is "+(b+c+totalamount)+" Rs");
		System.out.println("---------------------------------------------");
	}
}
public class USAcafeInfo {

	public static void main(String[] args) {
		USAcafe B=new USAcafe();
		B.totalamount=0;
		B.item="";
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO USA CAFE");
		System.out.println("MENU CARD");
		System.out.println("1.VEG");
		System.out.println("*******");
		System.out.print("1.SouthIndian		2.NorthIndian\n");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Items	 Rate		Items	 	Rate");
		System.out.println("-------------------------------------------------------------");
		System.out.println("1.Idly	 15		1.Roti		10");
		System.out.println("2.Vada	 25		2.Butternon	15");
		System.out.println("3.Dosa	 45		3.Chapathi	25");
		System.out.println("");
		System.out.println("2.NON-VEG");
		System.out.println("*******");
		System.out.print("1.SouthIndian					2.NorthIndian\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Items			Rate			Items			Rate");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("1.ChickenFry		80			1.Chicken Chettinaad	90");
		System.out.println("2.EggCurry	 	65			2.Chepala Iguru		80");
		System.out.println("3.ChickenBiryani	110			3.Kadai Chicken		85");
		System.out.println("");
		System.out.println("3.CHINESE");
		System.out.println("-----------------------------------------------");
		System.out.println("Items	 	Rate");
		System.out.println("-----------------------------------------------");
		System.out.println("1.Gobi	 	50	");
		System.out.println("2.Noodels	40	");
		System.out.println("3.Egg Gobi	40 ");
		System.out.println("");
		System.out.println("4.KORIAN");
		System.out.println("-----------------------------------------------");
		System.out.println("Items	 		Rate");
		System.out.println("-----------------------------------------------");
		System.out.println("1.Spicy Rice Cakes	 50	");
		System.out.println("2.Kimbap	 	 80	");
		System.out.println("3.Fish Pastries		 70 ");
		System.out.println();
		System.out.println("5.Bewarages");
		System.out.println("-----------------------------------------------");
		System.out.println("Items	 		Rate");
		System.out.println("-----------------------------------------------");
		System.out.println("1.Fruit Juice	 	30	");
		System.out.println("2.Coffee	 	15	");
		System.out.println("3.Tea		 	10 ");
		System.out.println("4.Coco Cola		45 ");
		System.out.println();
		System.out.println("Do You Want To Display The Items Code, Click Y/N.");
		char ch=sc.next().charAt(0);
		if(ch=='Y' || ch=='y') USAcafe.Pos();
		while(true) {
			System.out.println("");
			System.out.println("Enter The Item Code");
			int n=sc.nextInt();
			if(n==111) B.idly();
			else if(n==112) B.vada();
			else if(n==113) B.dosa();
			else if(n==121) B.roti();
			else if(n==122) B.butternon();
			else if(n==123) B.chapati();
			else if(n==211) B.chickenfry();
			else if(n==212) B.eggcurry();
			else if(n==213) B.chickenBiryani();
			else if(n==221) B.chickenChettinaad();
			else if(n==222) B.chapalaIguru();
			else if(n==223) B.kadaiChicken();
			else if(n==31) B.gobi();
			else if(n==32) B.noodles();
			else if(n==33) B.eggGobi();
			else if(n==41) B.spicyRiceCakes();
			else if(n==42) B.kimbap();
			else if(n==43) B.fishPastries();
			else if(n==51) B.fruitJuice();
			else if(n==52) B.coffee();
			else if(n==53) B.tea();
			else if(n==54) B.cocaCola();
			else {
				System.out.println("You Entered The Incorrect Code");
				continue;
			}
			System.out.println("Do You Want Any Other Items Click Y or Click N For Bring The Bill");
			char c=sc.next().charAt(0);
			if(c=='Y' || c=='y') continue;
			else {
				B.receipt();
				break;
			}	
		}
		System.out.println("Thank You For Visiting USA Cafe, Visit Again");
	}
}
