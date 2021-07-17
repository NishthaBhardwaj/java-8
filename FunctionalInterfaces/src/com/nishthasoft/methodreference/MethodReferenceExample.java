package com.nishthasoft.methodreference;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceExample {
	
	static Function<String, String> function = String::toUpperCase;
	
	static Consumer<String> con = (s) -> System.out.println(s);
	static Consumer<String> con1 = System.out::println;
	
	public static void main(String[] args) {
		
		System.out.println(function.apply("i hate you"));
		
	}

}
