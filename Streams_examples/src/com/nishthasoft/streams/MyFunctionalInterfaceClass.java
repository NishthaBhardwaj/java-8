package com.nishthasoft.streams;

import java.util.function.Supplier;

public class MyFunctionalInterfaceClass {
	
	public static <R, D, T> R passFunction(MyFunctionalInterface<Integer,Integer,R> fun,int a, int b) {
		
		return fun.hello(a,b);
		
		
	}
	
	public static void main(String[] args) {
		
		MyFunctionalInterface<Integer,Integer,Integer> t = (a, b) -> a+b;
		
		System.out.println(passFunction(t, 10, 20));
		
		Supplier<String> s = () -> "I am not suppliing any thing"; 
		s.get();
		
		
	}
	

}
