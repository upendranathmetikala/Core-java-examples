package com.startproject.Hashing;

class Student{
	String name;
	int marks;
	
	public Student(String n,int m) {
		name=n;
		marks=m;
	}
	
	public String toString() {
		return "Student [name = "+name+",marks = "+marks+"]";
	}
	
	@Override
	public int hashCode() {
		return marks;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Student)) return false;
		Student s=(Student)o;
		return (name.equals(s.name) && marks==s.marks);
	}
}



public class Demo1 {

	public static void main(String[] args) {
		Student s1=new Student("raja",68);
		Student s2=new Student("raja",68);
		
		
		System.out.println("Hashcode of s1 = "+s1.hashCode());
		System.out.println("Hashcode of s2 = "+s2.hashCode());
		
		Set<Student> s=new Set<Student>();
		System.out.println(s.add(s1));
		System.out.println(s.add(s2));
		
		System.out.println(s.size());
		
	
	}

}
