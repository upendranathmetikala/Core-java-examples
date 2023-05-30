package com.Object.pack1;

class Employee{
int id;
String name;
String gender;
int age;
static int dptName;
static String companyName;
public void displayEmployee() {
	System.out.println("Employee id: "+id);
	System.out.println("Employee name: "+name);
	System.out.println("Employee gender: "+gender);
	System.out.println("Employee age: "+age);
	System.out.println("Employee department name: "+dptName);
	System.out.println("Employee company name: "+companyName);
}
public static void changeDptName() {
	dptName=25;
}
public static void changeCompanyName() {
	companyName="SAMSUNG";
}
}
public class EmployeeInfo {

	public static void main(String[] args) {
	Employee.dptName=15;
	Employee.companyName="Flipkart";
	
	Employee E1=new Employee();
	E1.id=1;
	E1.name="Sreekanth";
	E1.gender="M";
	E1.age=25;
	E1.displayEmployee();
	System.out.println("---------------------------");
	
	Employee E2=new Employee();
	E2.id=2;
	E2.name="Sai";
	E2.gender="M";
	E2.age=24;
	E2.displayEmployee();
	System.out.println("---------------------------");
	
	Employee.changeDptName();
	Employee.changeCompanyName();
	
	E1.displayEmployee();
	System.out.println("---------------------------");
	E2.displayEmployee();
	}

}
