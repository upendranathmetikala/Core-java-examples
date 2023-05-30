package com.startproject.StreamAPI;

import java.util.ArrayList;
import java.util.List;

import com.startproject.LamdaExpression.Student;

public class TestMin3 {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		li.add(new Student(1, "ramu", "python"));
		li.add(new Student(2, "suresh", "mern"));
		li.add(new Student(3, "sujith", "java"));
		Student s = li.stream().min((e1,e2)->e1.toString().compareToIgnoreCase(e2.toString())).get();
		
		System.out.println(s); 

	}

}
