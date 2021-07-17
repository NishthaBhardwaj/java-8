package com.nishthasoft;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class PredicateStudentExample {
	
	
	
	static public Predicate<Student> p1 = (std) -> std.getGradeLevel() >=3; 
	static public Predicate<Student> p2 = (std) -> std.getGpa() >=3.9; 
	
	
	public static void filterStudentsByGreadLevel() {
		System.out.println("filterStudentsByGreadLevel");
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> {
			if (p1.test(student))
				System.out.println(student);
		});
	}
	
	public static void filterStudentsByGpa() {
		System.out.println("filterStudentsByGpa");
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> {
			if (p2.test(student))
				System.out.println(student);
		});
	}
	
	public static void filterStudents() {
		System.out.println("filterStudents");
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> {
			if (p1.or(p2).negate().test(student))
				System.out.println(student);
		});
	}
	
	
	public static void main(String[] args) {
		
		filterStudentsByGreadLevel();
		filterStudentsByGpa();
		filterStudents();
	}

}
