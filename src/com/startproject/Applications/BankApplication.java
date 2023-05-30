package com.startproject.Applications;
import java.util.Scanner;

class Bank{
	public double loanRateOfIntrest() {
		return 0.0;
	}
}

class SBI extends Bank{
	@Override
	public double loanRateOfIntrest() {
		return 0.09;
	}
	public double cropLoan() {
		return 0.05;
	}
}

class HDFC extends Bank{
	@Override
	public double loanRateOfIntrest() {
		return 0.08;
	}
	public double martgazeLoan() {
		return 0.1;
	}
}

class Axis extends Bank{
	@Override
	public double loanRateOfIntrest() {
		return 0.07;
	}
	public double educationLoan() {
		return 0.04;
	}
}


class Agent{
	public void ratesOfIntrest(Bank bank,double Amount) {
		double ROI = bank.loanRateOfIntrest();
		System.out.println("Rate of intrest for Home Loan is "+ROI*100+" %");
		System.out.println("Total Amount With Intrest is to be paid "+(Amount+=ROI*Amount));	
	}
	public void otherRateOfIntrests(Bank bank) {
		if(bank instanceof SBI) {
			SBI sbi = (SBI)bank;
			System.out.println("Crop loan, Rate of Intrest in SBI is "+sbi.cropLoan()+"%");
		}
		if(bank instanceof HDFC) {
			HDFC hdfc = (HDFC)bank;
			System.out.println("Martgaze loan, Rate of Intrest in HDFC is "+hdfc.martgazeLoan()+"%");
		}
		if(bank instanceof Axis) {
			Axis axis = (Axis)bank;
			System.out.println("Education loan, Rate of Intrest in Axis Bank is "+axis.educationLoan()+"%");
		}
	}
}

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		double Amount=sc.nextDouble();
		
		Agent agent = new Agent();
		
		agent.ratesOfIntrest(new SBI(),Amount);
		agent.otherRateOfIntrests(new SBI());
		System.out.println("--------------------------");
		agent.ratesOfIntrest(new HDFC(),Amount);
		agent.otherRateOfIntrests(new HDFC());
		System.out.println("--------------------------");
		agent.ratesOfIntrest(new Axis(),Amount);
		agent.otherRateOfIntrests(new Axis());
		System.out.println("--------------------------");
	}

}
