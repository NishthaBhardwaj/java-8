package com.nishthasoft.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.nishthasoft.data.StudentDataBase;

public class StreamFlatExample {
	
	public static List<String> printStudentSctivities(){
		
		List<String> activities = StudentDataBase.getAllStudents().stream()
		.map(student->student.getActivities())//Stream<List<String>
		.flatMap(List::stream)//Stream<String>
		.sorted()
		.distinct()
		.collect(Collectors.toList());
		
		return activities;
	}
	
public static long printStudentSctivitiesCount(){
		
		long activities = StudentDataBase.getAllStudents().stream()
		.map(student->student.getActivities())//Stream<List<String>
		.flatMap(List::stream)//Stream<String>
		.sorted()
		.distinct()
		.count();
		
		return activities;
	}
	
	public static void main(String[] args) {
		System.out.println(printStudentSctivities());
		System.out.println(printStudentSctivitiesCount());
		
	}

}
