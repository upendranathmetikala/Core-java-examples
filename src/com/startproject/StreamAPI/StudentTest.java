package com.startproject.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.startproject.LamdaExpression.Student;


public class StudentTest {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		li.add(new Student(1, "raju", "python"));
		li.add(new Student(2, "suresh", "mern"));
		li.add(new Student(3, "sujith", "java"));
		
		
		
		List<Student> li2=li.stream().filter(e->e.getName().startsWith("s")).collect(Collectors.toList());
		
		for(Student s:li2) {
			System.out.println(s);
		}
	}

}
