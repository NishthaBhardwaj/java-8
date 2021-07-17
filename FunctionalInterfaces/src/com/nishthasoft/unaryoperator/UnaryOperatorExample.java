package com.nishthasoft.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	//when you have input and output of same type then we can make use of UnaryOperator  for example
	//UnaryOperator<String> here you have input as String and return type also has string
	
	static UnaryOperator<String> unaryOperator = (name) -> name.concat(" default");
	
	public static void main(String[] args) {
		
		System.out.println(unaryOperator.apply("java8"));
		
	}

}
