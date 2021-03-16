package com.bas.java;

public class Operators {
	public static void main(String[] args) {
		//AirthmaticOperators.add();
		//UnaryOperators.increment();
		//UnaryOperators.decrement();
		TernaryOperator.ternary();
	}
}
class AirthmaticOperators{
	public static void add() {
		int i=5,j=5,k=i+j;
		System.out.println("addition of num+num ="+ k);
		char a='a',b='b',c='A',d='B';
		System.out.println(a+b+"= addition of char+char");
		System.out.println(c+b+"= addition of char+char");
		char e='R';int l=10;
		System.out.println(e+l+"= addition of char+int");
		int m=10;char f='K';
		System.out.println(m+f +"= addition of int+char");	
	}
	public static void sub() {
		int i=5,j=5,k=i-j;
		System.out.println("addition of num+num ="+ k);
		char a='a',b='b',c='A',d='B';
		System.out.println(a+b+"= addition of char+char");	
	}
}
class UnaryOperators{
	public static void increment(){
		int a=6;
		int b=a++;
		int c=b++;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
	public static void decrement(){
		int a=6;
		int b=a--;
		int c=b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class TernaryOperator{
	public static void ternary() {
		int a=6,b=5;
		int max=(b>a)?b:a;
		System.out.println(max);

	}
}
