package com.bas.java;

public class MethodEx1{
	public static void main(String[] args) {
		demo();
	}
	public static void sample(){
		System.out.println("in sample method");
	}
	public void run() {
		type();
		System.out.println("in run method");
	}
	public static void demo(){
		MethodEx1 s1=new MethodEx1();
		s1.type();
		System.out.println("in demo method");
	}
	public void type() {
		sample();
		System.out.println("in type method");
	}
}
class Sample{
	
}
