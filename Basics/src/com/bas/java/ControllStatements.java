package com.bas.java;

public class ControllStatements {
	public static void main(String[] args) {
		//Statements.ifelsestatement();
		//Statements.ifelseifstatement();
		//Statements.nestedifstatement();
		//Statements.switchstatement();
		//Loopstatments.forloop();
		Loopstatments.whileloop();
	}
}
class Statements{
	public static void ifelsestatement() {
		int i=10,j=20;
		if(i<j) {
		System.out.println("satisfied");	
		}
		else{
			System.out.println("unsatisfied");	
		}
	}
	public static void ifelseifstatement() {
		int i=6,j=8;
		if(j<i) {
		System.out.println("satisfied");	
		}
		else if(i<j){
			System.out.println("else if condition");	
		}
		else {
			System.out.println("condition not satisfied");
		}
	}
	public static void nestedifstatement() {
		int i=6,j=10;
		if(i<j) {
			System.out.println("first line satisfied");
			if(i==j) {
				System.out.println("nested if");
			}
			System.out.println("line break");
		}
		else {
			System.out.println("condition not satisfied");
		}
	}
	public static void switchstatement() {
		int month=10;
		switch(month) {
		case 1:System.out.println("january");
		break;
		case 2:System.out.println("feb");
		break;
		case 3:System.out.println("march");
		break;
		case 4:System.out.println("april");
		break;
		default:System.out.println("switch not satisfied");
		}
	}
}
class Loopstatments{
	public static void forloop() {
	int a=5;
	for(int i=0;i<a;i++) {
		System.out.println(i);
	}
	}
	public static void whileloop(){
		int b=5,c=8;
		do {
			System.out.println(b);
			b++;
		}while(b<=c);
	}
}