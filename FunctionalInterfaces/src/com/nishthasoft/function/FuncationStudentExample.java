package com.nishthasoft.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.nishthasoft.PredicateStudentExample;
import com.nishthasoft.data.*;

public class FuncationStudentExample {
	
	static Function<List<Student>, Map<String,Double>> studentFucntion = (students) -> {
		Map<String,Double> studentGradeMap= new HashMap<>();
		students.forEach(std-> {
			if(PredicateStudentExample.p1.test(std))
				studentGradeMap.put(std.getName(), std.getGpa());
		});
		return studentGradeMap;
	} ;

	public static void main(String[] args) {
		
		System.out.println(studentFucntion.apply(StudentDataBase.getAllStudents()));
		
	}
	
}
