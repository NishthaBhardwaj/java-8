package com.nishthasoft.streamexample;

import java.util.ArrayList;
import java.util.stream.Stream;



public class CollectionVSStreams {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("adam");
		names.add("jim");
		names.add("jenny");
		
		/*
		 * for(String name: names) { System.out.println(name); } for(String name: names)
		 * { System.out.println(name); }
		 */
		
		names.remove(0);
		System.out.println(names);
		
		Stream<String> stream = names.stream();
		stream.forEach(System.out::println);
	}
	

}
