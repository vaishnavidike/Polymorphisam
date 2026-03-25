package com.linkcode.Home;


public class Book {

	public Book(String bookName, String author, int noOfPages, double price) {
		this.bookName = bookName;
		this.author = author;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	String bookName;
	String author;
	int noOfPages;
	double price;
	
	public void displayInfo() {
		System.out.println("Book name:"+bookName);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		
	}
	public void read() {
		System.out.println("reading");
	}
	
	
}
