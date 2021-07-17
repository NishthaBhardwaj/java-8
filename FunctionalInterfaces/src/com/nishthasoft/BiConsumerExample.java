package com.nishthasoft;

import java.util.List;
import java.util.function.BiConsumer;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class BiConsumerExample {
	
	static BiConsumer<String, List<String>> nameAndActivites = (name,activity) -> {
		System.out.print(name);
		System.out.println(activity);
	};

	
	public static void nameAndActivities() {
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> nameAndActivites.accept(student.getName(), student.getActivities()));
		
	}

	public static void main(String[] args) {
		
		BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("Value of a:- " + a + " value od B is:- "+b);
		biConsumer.accept("HI", "nishtha");
		
		BiConsumer<Integer, Integer> multipply = (a,b) -> System.out.println("Multiplication:- " + (a * b));
		multipply.accept(4, 70);
		
		BiConsumer<Integer, Integer> divid = (a,b) -> System.out.println("Division :- " + (a/b));
		
		multipply.andThen(divid).accept(20, 5);
		nameAndActivities();

	}
}
