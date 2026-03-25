package com.linkcode.Home;

import java.util.Scanner;

public class NotebookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Notebook Details");
		System.out.println("How many notebook Details:");
		
		int n=sc.nextInt();
		
		Notebook arr[]=new Notebook[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Notebook detail");
			System.out.println("Enter notebook size");
			String size=sc.next();
			System.out.println("Enter no of pages");
			int pages=sc.nextInt();
			System.out.println("Enter notebook color");
			String color=sc.next();
			System.out.println("Enter notebook price");
			double price=sc.nextDouble();
			System.out.println("Enter notebook brand");
			String brand=sc.next();
			
			arr[i]=new Notebook(size, pages, color, price, brand);
		}
		
		for(Notebook a:arr) {
			System.out.println("===============================");
			System.out.println("Notebook details added succesfully");
			System.out.println("Display Notebook Details:");
			System.out.println("Notebook size:"+a.size);
			System.out.println("Notebook Pages:"+a.pages);
			System.out.println("Notebook Price:"+a.price);
			System.out.println("Notebook color:"+a.color);
			System.out.println("Notebook Brand:"+a.brand);
			
			System.out.println("===============================");
			
		}
			
		}

}
