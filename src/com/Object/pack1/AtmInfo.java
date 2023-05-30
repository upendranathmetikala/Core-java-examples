package com.Object.pack1;

import java.util.Scanner;
class Atm{
	int originalpin;
	double totalAmount;
	double withdrawAmount;
	double balanceAmount;
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Enter Withdraw Amount");
			withdrawAmount=sc.nextInt();
			if(withdrawAmount<100 || withdrawAmount%100!=0) {
				System.out.println("Invalid Amount,Entered Amount should be greater than 100, only multiples of 100");
				continue;
			}
			else if(withdrawAmount>totalAmount) {
				System.out.println("Your Transaction is Failed Due To Insufficient Funds in Account.");
				break;
			}
			else {
			totalAmount=totalAmount-withdrawAmount;
			System.out.println("Your Withdraw Amount "+withdrawAmount+" is Succeded");
			break;
			}
		}	
		System.out.println("You Want To Display Current Balance \nClick Y or N");
		char ch=sc.next().charAt(0);
		if(ch=='y' || ch=='Y') checkBalance();	
	}
	public void checkBalance() {
		System.out.println("Your Current Balance is "+totalAmount);
	}
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Do Deposit only 100,500 and 2000 Notes\nYou Can Deposit Upto 50000 Only");
			System.out.println("Do You Want to Continue The Transaction, Click Y/N");
			char choice=sc.next().charAt(0);
			if(choice=='n' || choice=='N') {
				System.out.println("Your Transaction is Cancelled");
				break;
			}
			else {
				System.out.println("Enter no.of 100 Notes");
				int a=sc.nextInt();
				System.out.println("Enter no.of 500 Notes");
				int b=sc.nextInt();
				System.out.println("Enter no.of 2000 Notes");
				int c=sc.nextInt();
				double Amount=(100*a)+(500*b)+(2000*c);
				if(Amount>50000) System.out.println("Transaction Failed Due To The Deposited Amount Is Greater Than Maximum Limit");
				else {
					totalAmount=Amount+totalAmount;
					System.out.println("Total Deposit Amount Rs "+Amount+" Is Successfully Added To Your Account");
					System.out.println("You Want To Display Current Balance \nClick Y or N");
					char ch=sc.next().charAt(0);
					if(ch=='y' || ch=='Y') {
						checkBalance();
					}
				}
				break;
			}
		}
	}
}

public class AtmInfo{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Atm A1=new Atm();
		A1.originalpin=1234;
		A1.totalAmount=10000;
		System.out.println("WELCOME TO ABI ATM");
		System.out.println("1.BANKING.\nPlease Select Banking By Pressing 1.");
		int ch=sc.nextInt();
		if(ch==1) {
			while(true) {
				System.out.println("Enter Your 4-Digit pin");
				int pin=sc.nextInt();
				if(pin!=A1.originalpin) {
					System.out.println("Incorrect pin");
					continue;
					}
				else {
					while(true) {
						System.out.println("1.WITHDRAW \n2.CHECK BALANCE\n3.DEPOSIT");
						System.out.println("Please Select Transaction by Pressing Numbers");
						int c=sc.nextInt();
					
						if(c==1) {
							A1.withdraw();
						}
						else if(c==2) {
							A1.checkBalance();
						}
						else if(c==3) {
							A1.deposit();
						}
						else
						System.out.println("You Entered a Invalid Choice");
						System.out.println("Do you want to Repeat Process Again, click Y/N");
						char d=sc.next().charAt(0);
						if(d=='y' || d=='Y') continue;
						else break;
					}
				}
				break;
			}
			System.out.println("Thank You For Visiting ABI ATM, Visit Again.");
		}
	}
}

