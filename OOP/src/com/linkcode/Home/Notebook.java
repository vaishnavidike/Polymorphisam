package com.linkcode.Home;

public class Notebook {
	public Notebook(String size, int pages, String color, double price, String brand) {
		super();
		this.size = size;
		this.pages = pages;
		this.color = color;
		this.price = price;
		this.brand = brand;
	}
	String size;
    int pages;
	String color;
	double price;
	String brand;
	public void displayInfo() {
		System.out.println("Notebook size:"+size);
		System.out.println("Notebook pages:"+pages);
		System.out.println("Notebook color:"+color);
		System.out.println("Price:"+price);
		System.out.println("Brand:"+brand);
		
	}
	public void read() {
		System.out.println("Writeing...");
	}
	

}
