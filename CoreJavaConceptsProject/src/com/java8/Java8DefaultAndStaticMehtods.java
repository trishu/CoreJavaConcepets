package com.java8;

interface I{
	
	default void show(){
		System.out.println("Hi!");
	}
	
	static void print(){
		System.out.println("print this");
	}
	
	//this equals method will throw the compilation since it has the same signature with object class equals method,.
//	default boolean equals(Object o){
//		return true;
//	}
}

class Iimpl implements I{
	
}

public class Java8DefaultAndStaticMehtods {

	public static void main(String[] args) {
		Iimpl impl = new Iimpl();
		impl.show();
		
		I.print();
	}
}
