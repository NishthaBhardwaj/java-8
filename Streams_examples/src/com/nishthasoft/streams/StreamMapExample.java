package com.nishthasoft.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class StreamMapExample {

	public static List<String> namesList() {

		return (List<String>) StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(student -> student.getName())
				.map(String::toUpperCase)// Stream<String>
				.collect(Collectors.toList());
	}
	
	public static Set<String> namesSet() {

		return (Set<String>) StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(student -> student.getName())
				.map(String::toUpperCase)// Stream<String>
				.collect(Collectors.toSet());
	}
	

	public static void main(String[] args) {

		System.out.println(namesList());
		System.out.println(namesSet());
		
		Map<String,List<String>> stud = StudentDataBase.getAllStudents()
				.stream()
				.peek(student->{System.out.println("---------");
				System.out.println(student);
				System.out.println("---------");})
				.filter(student->student.getGpa()>=2)
				.peek(student->{System.out.println("--$------");
				System.out.println(student);
				System.out.println("----$-----");})
				.collect(Collectors.toMap(
				(student)->student.getName(), (student)->student.getActivities())
									
				);
		System.out.println("----------------");
		System.out.println(stud);
		
		
		List<String> acti = StudentDataBase.getAllStudents().stream()
		.map(student->student.getActivities())
		.flatMap(List::stream)
		.collect(Collectors.toList());
		
		System.out.println(acti);
		

	}

}
