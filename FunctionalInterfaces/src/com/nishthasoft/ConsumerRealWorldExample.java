package com.nishthasoft;

import java.util.List;
import java.util.function.Consumer;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class ConsumerRealWorldExample {
	
	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (std) -> System.out.println(std.getName());
	static Consumer<Student> c3 = (std) -> System.out.println(std.getActivities());

	public static void printNames() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c1);
		//studentList.forEach(std1 -> System.out.println(std1));
		
	}
	
	public static void printNameAndActivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2.andThen(c3)); // consumer chaning 
	}
	
	public static void printNameAndActivitiesUsingConditions() {
		System.out.println("printNameAndActivitiesUsingConditions");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(student.getGradeLevel() > 3 && student.getGpa() >= 3.9) {
				c2.andThen(c3).accept(student);
		}
		}); // consumer chaning 
	}

	public static void main(String[] args) {
		//printNames();
		printNameAndActivities();
		printNameAndActivitiesUsingConditions();

	}

}
