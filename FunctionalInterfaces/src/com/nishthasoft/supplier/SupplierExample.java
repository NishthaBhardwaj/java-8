package com.nishthasoft.supplier;

import java.util.Arrays;
import java.util.function.Supplier;

import com.nishthasoft.data.Student;

public class SupplierExample {
	
	public static void main(String[] args) {
		
		Supplier<Student> student = () ->{
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
			};
			
			System.out.println(student.get());
		
	}
	
	
}
