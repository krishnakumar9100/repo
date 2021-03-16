package com.bas.java;

class Super{
	int a=100;
	void animal() {
		System.out.println("in animal method");
	}
}
public class SuperKeyword extends Super{
	public void dog() {
		int a=500;
		System.out.println("in dog method");
		System.out.println(super.a);
		super.animal();
		
	}
	public static void main(String[] args) {
		SuperKeyword s=new SuperKeyword();
		s.dog();
		
	}
}
