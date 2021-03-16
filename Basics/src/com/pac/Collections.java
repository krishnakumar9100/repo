package com.pac;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		ArrayList();
		//converting();
	}
public static void ArrayList() {
	HashSet a=new HashSet();
	a.add("krishna");
	a.add("kumar");
	a.add("loves");
	a.add("rosy");
	//a.add("madu");
	a.add("kumar");
	//a.add("");
	//a.remove(4);
	//System.out.println(a);
	Iterator i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
	public static void converting() {
		String[] str= {"leela","venkata","krishna","kumar"};
		ArrayList l=new ArrayList();
		for(String s:str) {
			l.add(s);
		}
		System.out.println(l);

	}
}
