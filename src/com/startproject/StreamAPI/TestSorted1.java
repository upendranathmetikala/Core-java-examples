package com.startproject.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.startproject.LamdaExpression.Student;

public class TestSorted1 {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		li.add(new Student(1, "raju", "python"));
		li.add(new Student(2, "suresh", "mern"));
		li.add(new Student(3, "sujith", "java"));
		li.add(new Student(4, "sujith", "aws"));
		List<Student> li2=li.stream().distinct().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		
		for(Student l:li2) System.out.println(l);
	}

}
