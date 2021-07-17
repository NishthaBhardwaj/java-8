package com.nishthasoft;
import java.util.*;

public class ComparatorLamdaExample {
	
	public static void main(String[] args) {
		
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2); // 0 - 01==02
				                         // 1 - 02>01
				                         // -1 o1>02
			}
		};
		
		System.out.println(com.compare(40, 50));
		
		Comparator<Integer> com1 = (a,b) -> a.compareTo(b);
		
		System.out.println(com1.compare(50, 10));
		
		
		
	
	}
		

}