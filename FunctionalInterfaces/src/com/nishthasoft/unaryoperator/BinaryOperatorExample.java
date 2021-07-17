package com.nishthasoft.unaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static Comparator<Double> com = (a,b) -> a.compareTo(b);
	
	//when you have input and output of same type then we can make use of UnaryOperator  for example
		//BinaryOperator<Double> here you have input as Double and return type also has Double
	
	public static void main(String[] args) {
		BinaryOperator<Double> biOperator = (a,b) -> a+b;
		
		System.out.println(biOperator.apply(5.0, 6.0));
		
		System.out.println(BinaryOperator.minBy(com).apply(35.0, 56.0));
		System.out.println(BinaryOperator.maxBy(com).apply(35.0, 56.0));
	}
	
	

}
