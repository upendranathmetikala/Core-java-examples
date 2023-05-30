package com.startproject.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.startproject.LamdaExpression.Student;

public class TestFilter2 {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		li.add(new Student(1, "raju", "python"));
		li.add(new Student(2, "suresh", "mern"));
		li.add(new Student(3, "sujith", "java"));
		
		Predicate<Student> pre=new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getCourse().equalsIgnoreCase("JAVA");
			}	
		};
		
		List<Student> li2 = li.stream().filter(pre).collect(Collectors.toList());
		
		for(Student s:li2) {
			System.out.println(s);
		}
	}

}
