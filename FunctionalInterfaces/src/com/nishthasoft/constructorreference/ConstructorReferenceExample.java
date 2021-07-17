package com.nishthasoft.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.nishthasoft.data.Student;

public class ConstructorReferenceExample {
	
	static Supplier<Student> studen = Student::new;
	
	static Function<String, Student> studentFuncation = Student::new;
	
	public static void main(String[] args) {
		
		System.out.println(studen.get());
		
		System.out.println(studentFuncation.apply("Nishtha"));
		
	}
	

}
