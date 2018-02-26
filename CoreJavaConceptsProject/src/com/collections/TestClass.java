package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestClass {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.put("1", "one"));
		System.out.println(map.put("1", "two"));
	}

}
