package com.nishthasoft.lambda;

import java.util.function.Consumer;

public class LambdaVariable {
	
	
	public static void main(String[] args) {
		
		int i = 0;
		
		int value = 4;
		
		Consumer<Integer> com = (i1) ->{
			
			int i2 = 0;
			System.out.println(i1);
		};
		
		Consumer<Integer> com1 = (a) -> {
			System.out.println(value + a);
			
		};
		
		com1.accept(2);
	
		
	}
	

}
