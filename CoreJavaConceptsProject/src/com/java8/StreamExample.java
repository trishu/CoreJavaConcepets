package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("trishu", "agney", 29),
				new Person("harsh", "kumar", 27),
				new Person("rohir", "agarwal", 29),
				new Person("chandan", "kuamr", 31)
				);
		
		persons.stream().forEach(System.out::println);
		
		long ageGreater30 =  persons.stream()
		.filter(p -> p.getAge()>30)
		.count();
		
		System.out.println("count ageGreater30 is "+ageGreater30);
		
		persons.stream().filter(p -> p.getLastName().startsWith("k")).forEach(System.out::println);
		
	}

}

class Person{
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
}