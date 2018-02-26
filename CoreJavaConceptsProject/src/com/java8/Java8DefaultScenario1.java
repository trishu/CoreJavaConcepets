package com.java8;

interface Interface1{
	default void show(){
		System.out.println("Hi int 1!");
	}
}

interface Interface2{
	default void show(){
		System.out.println("Hi int 2!");
	}
}

public class Java8DefaultScenario1 implements Interface1,Interface2{
	
	public void show(){
		System.out.println("Hi class!");
	}

	public static void main(String[] args) {
		
		//Here to resolve the diamond problm we need to overirde the show method of both interfaces default method.
		Java8DefaultScenario1 obj = new Java8DefaultScenario1();
		obj.show();
	}
}
