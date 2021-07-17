package com.nishthasoft.methodreference;

import java.util.function.Predicate;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class RefectorMethodReferenceExample {
	
	static public Predicate<Student> p1 = (std) -> std.getGradeLevel() >=3; 
	static Predicate<Student> p2 = RefectorMethodReferenceExample::greaterThenGreadLevel;
	
	
	
	
	public static  boolean greaterThenGreadLevel(Student std) {
		return std.getGradeLevel() >= 3;

	}
	
	public static void main(String[] args) {
		
		System.out.println(p1.test(StudentDataBase.studetSupplier.get()));
		System.out.println(p2.test(StudentDataBase.studetSupplier.get()));
		
	}

}
