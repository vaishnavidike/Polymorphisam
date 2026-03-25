package com.linkcode.Polymirphism.methodOverriding;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private String loc;
	
	public Employee(int id, String name, double sal, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.loc = loc;
	}
	public void dislpayInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.sal);
		System.out.println("Location:"+this.loc);
	}
	public String toString() {
		return loc;
	}
	public boolean equals(Object obj) {
		return(this.name == ((Employee)obj).name);
	}
	}
