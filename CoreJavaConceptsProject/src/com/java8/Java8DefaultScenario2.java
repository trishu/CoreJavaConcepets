package com.java8;

interface InterfaceA{
	default void show(){
		System.out.println("Hi interface!");
	}
}

class ClassA implements InterfaceA{
	public void show(){
		System.out.println("Hi class!");
	}
}

public class Java8DefaultScenario2 implements InterfaceA{
	
	public static void main(String[] args) {
		
		//Here to class method show has more priority then interface default method.
		ClassA obj = new ClassA();
		obj.show();
	}
}
