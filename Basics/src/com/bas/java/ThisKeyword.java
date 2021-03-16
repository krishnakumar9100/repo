package com.bas.java;

public class ThisKeyword{

	public static void main(String[] args) {
		Kumar t=new Kumar();
		t.disp();
		Constructorex c=new Constructorex();
	}
}
class Kumar{
	int noofitems=100;
	void disp(){
		int noofitems=200;
		System.out.println(this.noofitems);
	}
}
class Constructorex{
	Constructorex(){
	this(10);
	System.out.println("in constructon");
	}
	Constructorex(int i){
		System.out.println("in parameter cnstructor");
	}
}
