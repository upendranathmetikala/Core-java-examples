package com.Object.pack1;

class Patient {
	int id;
	String name;
	String gender;
	int age;
	static int wardName;
	static String hospitalName;
	public void displayPatient() {
		System.out.println("Patient id: "+id);
		System.out.println("Patient name: "+name);
		System.out.println("Patient gender: "+gender);
		System.out.println("Patient age: "+age);
		System.out.println("Patient ward name: "+wardName);
		System.out.println("Patient hospital name: "+hospitalName);
	}
	public static void changeDptName() {
		wardName=5;
	}
	public static void changeHospitalName() {
		hospitalName="Narmada";
	}
}
public class PatientInfo{

	public static void main(String[] args) {
	Patient.wardName=10;
	Patient.hospitalName="Medinova";
		
	Patient P1=new Patient();
	P1.id=1;
	P1.name="Sumanth";
	P1.gender="M";
	P1.age=24;
	P1.displayPatient();
	System.out.println("---------------------------");
		
	Patient P2=new Patient();
	P2.id=2;
	P2.name="Yathish";
	P2.gender="M";
	P2.age=25;
	P2.displayPatient();
	System.out.println("---------------------------");
		
	Patient.changeDptName();
	Patient.changeHospitalName();
		
	P1.displayPatient();
	System.out.println("---------------------------");
	P2.displayPatient();
}

}
