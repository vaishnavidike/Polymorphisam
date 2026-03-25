package com.linkcode.has;

public class Human {
	
	Heart heart;
	Human(){
		heart=new Heart();
	}
	
	public void live() {
		heart.work();
		System.out.println("Human is alive");
	}
	

}
