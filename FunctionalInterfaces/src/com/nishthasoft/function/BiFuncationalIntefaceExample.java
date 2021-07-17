package com.nishthasoft.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.nishthasoft.PredicateStudentExample;
import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class BiFuncationalIntefaceExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> studentBiFunctions = 
			(studentList,studentPredicate) ->{
				Map<String,Double> studentMap = new HashMap<>();
				studentList.forEach(std-> {
					if(studentPredicate.test(std))
						studentMap.put(std.getName(), std.getGpa());
				});
				return studentMap;
	};
	
	public static void main(String[] args) {
		
		System.out.println(studentBiFunctions.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p2));
		
		
		
	}

}
