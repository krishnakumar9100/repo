package com.bas.java;

class Method{
	public void overloadding(int i) {
		System.out.println("in integer method");
	}
	public void overloadding(float l) {
		System.out.println("in long method");
	}
	public void overloadding(int i,String s) {
		System.out.println("in integer,String method");
	}
	public void overloadding(double f,int i) {
		System.out.println("in double,integer method");
	}
	public void overloadding(char c,int i) {
		System.out.println("in integer method");
	}
}
public class MethodOverlodding {
	public static void main(String[] args) {
		Method m=new Method();
		m.overloadding(0);
		//m.overloadding(0, "kumar");
		//m.overloadding(1.0, 10);
		//m.overloadding('k', 0);
		
	}
}
