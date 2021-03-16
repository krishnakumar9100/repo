package com.bas.java;

class Override{
	public static void override() {
		System.out.println("in before override method");
	}
}
class Override1 extends Override{
	public static void override() {
		System.out.println("in after override method");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Override1 o=new Override1();
		o.override();	
	}

}
