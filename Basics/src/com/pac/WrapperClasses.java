package com.pac;

public class WrapperClasses {
	public static void main(String[] args) {
		boxing();
		unboxing();
	}
	public static void boxing() {
		int i=10;
		Integer i1=new Integer(i);
		System.out.println(i1);
	}
	public static void unboxing() {
		int i=10;
		Integer i1=new Integer(i);
		int j=i1;
		System.out.println(j);
	}
}
