package com.nishthasoft.streams;


@FunctionalInterface
public interface MyFunctionalInterface<T,D, R> {
	
	R hello(T t, D d);
	
	

}
