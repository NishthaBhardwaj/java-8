package com.nishthasoft.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class StreamComparatorExample {
	
	static Function<Student, String> f = (std) -> std.getName();
	
	public static List<Student> sortStudentsByName() {
		
		List<Student> std = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing((student) -> f.apply(student)))
		.collect(Collectors.toList());
		
		return std;
		
	}
	
public static List<Student> sortStudentsByGpa() {
		
		List<Student> std = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing((Student::getGpa)))
		.collect(Collectors.toList());
		
		return std;
		
	}

public static List<Student> sortStudentsByGpaDesc() {
	
	List<Student> std = StudentDataBase.getAllStudents().stream()
	.sorted(Comparator.comparing((Student::getGpa)).reversed())
	.collect(Collectors.toList());
	
	return std;
	
}
	
	public static void main(String[] args) {
		System.out.println(sortStudentsByName());
		System.out.println(sortStudentsByGpaDesc());
		
	}

}
