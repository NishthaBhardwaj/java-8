package com.nishthasoft.function;

import java.util.function.Function;

public class FunctionIntefaceExample {
	
	static Function<String,String> function = (name) -> name.toUpperCase(); 
	static Function<String,String> addSomeString = (name) -> name.concat("default"); 
	
	public static void main(String[] args) {
		
		System.out.println(function.apply("java8"));
		
		System.out.println("Result of andThen is:- " + function.andThen(addSomeString).apply("java8"));
		System.out.println("Result of compose is:- " + function.compose(addSomeString).apply("java8"));
		
	}
	

}
