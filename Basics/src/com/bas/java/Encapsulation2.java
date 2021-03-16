package com.bas.java;

public class Encapsulation2 {
	int amount=5000;
	public void setamount(int amount,int key) {
		if(key==123) {
			this.amount=this.amount+amount;
		}
	}
	void disp() {
		System.out.println(amount);
	}
	public static void main(String[] args) {
		Encapsulation2 e1=new Encapsulation2();
		e1.setamount(10000, 123);
		e1.disp();
	}
}
