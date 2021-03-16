package com.bas.java;

abstract class calc{
	abstract int add(int x,int y);
	int sub(int x,int y) {
		return x-y;
	}
}
class calcafter extends calc{
	int add(int x, int y) {
		return x+y;
	}
	
}
public class Abstraction {
	public static void main(String[] args) {
		calcafter c=new calcafter();
		int addvalue=c.add(10, 20);
		int subvalue=c.sub(10, 20);
		System.out.println(addvalue);
		System.out.println(subvalue);
	}
}
