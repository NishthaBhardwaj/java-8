package com.nishthasoft.streamexample;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class StreamExamples {
	
	static Function<Student,String> fuc = (std) -> std.getName();
	static Function<Student,List<String>> fuc1 = (std) -> std.getActivities();
	static Predicate<Student> gpaStudent = (std) -> std.getGpa()>=3.9;
	
	public static void main(String[] args) {
		Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.toMap(Student::getName,Student::getActivities));
		
		
		Map<String,List<String>> studentMap2 = StudentDataBase.getAllStudents().stream()
				.peek(std -> System.out.println(std))
				.filter((std) -> std.getGradeLevel()>=3)//Stream<Student>
				.peek(std -> System.out.println("after first filter "+std))
				.filter(gpaStudent) // Stream<Student>
				.collect(Collectors.toMap((std)-> std.getName(), (st)-> st.getActivities()));
		
		System.out.println(studentMap);
		System.out.println(studentMap2);
	}

}
