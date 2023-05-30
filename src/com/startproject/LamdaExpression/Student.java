package com.startproject.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

 public class Student{
	private int id;
	private String name;
	private String course;
	
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
}

class StudentTest{
	public static void main(String[] args) {
		List<Student> li= new ArrayList<Student>();
		li.add(new Student(1, "sree", "java"));
		li.add(new Student(2, "sharath", "python"));
		li.add(new Student(3, "harsha", "mern"));
		StudentTest st = new StudentTest();
		st.sortByName(li);
	}
		
	public void sortByName(List<Student> li) {
		Collections.sort(li,(e1,e2)->{return e1.getName().compareTo(e2.getName());});
		
		for(Student s:li) {
			System.out.println(s);
		}
	}
}

