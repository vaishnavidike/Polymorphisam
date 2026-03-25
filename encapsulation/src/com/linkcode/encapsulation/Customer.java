package com.linkcode.encapsulation;

public class Customer {
	
	//Private getters setters
	
	private int accno;
	String name;
	long mobail;
	String add;
	private String pass;
	private double bankbalance;
	
	public double getbankbalance() {
		return this.bankbalance;
	}
	public void setbankbalance(double amount) {
		this.bankbalance+=amount;
	}
	public int getaccno() {
		return this.accno;
	}
	public void setAccno(int no) {
		this.accno=no;
	}
	public Customer(int accno, String name, long mobail, String add, double bankbalance, String pass) {
		
		this.accno = accno;
		this.name = name;
		this.mobail = mobail;
		this.add = add;
		this.bankbalance = bankbalance;
		this.pass=pass;
		
		
	}
	public void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("AccNo:"+accno);
		System.out.println("BankBalance:"+bankbalance);
	}
	public Object getPass() {
		return this.pass;
	}
	public void withdraw(double amount) {
		System.out.println("Withdrawing amount..........");
		this.bankbalance-=amount;
		System.out.println("Available Balance:"+this.bankbalance);
	}
	public void deposit(double amount) {
		bankbalance += amount;
		
	}
	

}
