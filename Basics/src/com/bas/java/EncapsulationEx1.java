package com.bas.java;

public class EncapsulationEx1 {
	private String sname;
	private int sno;
	public void setsname(String sname) {
		this.sname=sname;
	}
	public String getsname() {
		return sname;
	}
	public void setsno(int sno) {
		this.sno=sno;
	}
	public int getsno() {
		return sno;
	}
	public static void main(String[] args) {
		EncapsulationEx1 e=new EncapsulationEx1();
				e.setsname("kumar");
				e.setsno(113);
				System.out.println(e.getsname());
				System.out.println(e.getsno());
	}
}
