package com.nishthasoft;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		
		consumer.accept("Nishtha");
	}

}
