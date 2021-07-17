package com.nishthasoft;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	Predicate<Student> p1 = (std) -> std.getGradeLevel() > 3;
	Predicate<Student> p2 = (std) -> std.getGpa() > 3.9;
	BiPredicate<Integer, Double> biPredicate = (grade,gpa) -> grade >= 3 && gpa >= 3.9;
	
	BiConsumer<String, List<String>> studentBiConsumer = (name,activity) -> System.out.println(name + ": " + activity);
	
	Consumer<Student> c1 = (std) -> {
		if(biPredicate.test(std.getGradeLevel(),std.getGpa()))
			studentBiConsumer.accept(std.getName(), std.getActivities());
			
	};
	
	public void printNameAndActivities() {
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(c1);
		
	}
	
	public static void main(String[] args) {
		new PredicateAndConsumerExample().printNameAndActivities();
		
		
		
	}
	

}
