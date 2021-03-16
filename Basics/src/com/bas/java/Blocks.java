package com.bas.java;

public class Blocks {
	 public void run() {
		System.out.println("in run method");
	}
	public static void main(String[] args) {
		A a=new A();
		a.disp();
		B b=new B();
		System.out.println(b.CITY);
		System.out.println(b.PIN);
	}
}
class A{
	final int x=10;
	final int y;
	{
		System.out.println("in nonstatic block");
		y=20;
	}
	A(){
		System.out.println("in constructor");
		//y=200;
	}
	void disp() {
		//x=100;
		//y=300;
		System.out.println("x value= "+x);
		System.out.println("y value= "+y);
	}
}
class B{
	static final String CITY="hyderabad";
	static final String PIN;
	static {
		PIN="522403";
		System.out.println("in static block of class B");
		
	}
}