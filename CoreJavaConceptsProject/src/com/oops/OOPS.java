package com.oops;

public class OOPS {
	
	public static void main(String[] args) {
		
		B b = new B();
		// instanceof checks for "IS-A" releationship
		System.out.println(b instanceof A);
	}
}


class A{
	
	private int a;
	
	private String b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
}

class B extends A{
	
}