package com.bas.java;
class Dog{
	public void dog(){
		System.out.println("in dog method");
	}
}
class Cat extends Dog{
	public void cat() {
		System.out.println("in cat method");
	}
}
class Rat extends Cat{
	public void rat() {
		System.out.println("in rat method");
	}
	
}
class SmallCat extends Dog{
	public void smallcat() {
		System.out.println("in smallcat method");
	}
}
class BigCat extends SmallCat{
	public void bigcat(){
		System.out.println("in bigcat method");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		//Cat c=new Cat(); //single level inheritance
		//c.cat();c.dog();
		//Rat r= new Rat();	//multi-level inheritance
		//r.cat();r.dog();r.rat();
		//Cat c1=new Cat();	//hirarichal inheritance
		//c1.cat();
		//SmallCat s1=new SmallCat();
		//s1.smallcat();
		BigCat B=new BigCat();	//Hybrid inheritance
		B.bigcat();
	}
}
