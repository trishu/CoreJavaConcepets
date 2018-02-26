package com.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//now to iterating this we can use 2 types of for loop.
		//both called as external for loop since we are getting the element outside of the collectios list.
		
		//1st is gereral for loop
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//2nd is enhanced for loop
		for(int i: list){
			System.out.println(i);
		}
		
		//Java 8 provided the new forEach method with is internal for each method with is more efficeint in terms of speed 
		//since it is internal method of List collection. it uses lambda experession
		list.forEach(i -> System.out.println(i));
	}

}
