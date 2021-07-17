package com.nishthasoft.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.nishthasoft.data.Student;
import com.nishthasoft.data.StudentDataBase;

public class StreamReduce {

	public static int performMultiplication(List<Integer> list) {

		int t = list.stream()
				// a=1,b=1(from stream) => result 1 is return
				// a=1,b=3 => from stream) => result 3 is return
				// a=3,b=5 => from stream) => result 15 is return
				// a=15,b=7 => result 105 is return
				.peek(System.out::println) //
				.reduce(1, (a, b) -> a * b);

		return t;

	}

	public static Optional<Integer> performMultiplicationwithoutIdentity(List<Integer> list) {

		Optional<Integer> t = list.stream()
				// a=1,b=1(from stream) => result 1 is return
				// a=1,b=3 => from stream) => result 3 is return
				// a=3,b=5 => from stream) => result 15 is return
				// a=15,b=7 => result 105 is return
				.peek(System.out::println) //
				.reduce((a, b) -> a * b);

		return t;

	}

public static Optional<Student> getHigherGpaStudent(){
	
	List<Student> students = StudentDataBase.getAllStudents();
	
	return students.stream()
	.reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2 );
	
	
}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 5, 7);
		System.out.println(performMultiplication(list));
		System.out.println(performMultiplicationwithoutIdentity(list).get());
		System.out.println(getHigherGpaStudent().get().getGpa());
		

	}

}
