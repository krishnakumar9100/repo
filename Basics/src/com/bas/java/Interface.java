package com.bas.java;

interface one{
	public void first();
	public void second();
	default void third() {
		System.out.println("in third method");
	}
}
class two implements one{
	public void first() {
		System.out.println("in first method");
	}
	public void second() {
		System.out.println("in second method");
	}
}
public class Interface {
	public static void main(String[] args) {
		two t=new two();
		t.first();
		t.second();
		t.third();
	}
}
