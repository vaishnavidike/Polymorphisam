package com.linkcode.Home;

import java.util.Scanner;

public class BookMain {
	static Scanner sc = new Scanner(System.in);
	static Book books[]=new Book[50];
	static int count;
	
	static {
		books[count++]=new Book("harry", "JK Rowling",100,200);
		books[count++]=new Book("artofwar", "sam",300,500);
		books[count++]=new Book("ikigai", "abc",200,400);	
	}
	public static void main(String[] args) {
		boolean flag=true;
		
		while(flag) {
			System.out.println("Book Management");
			System.out.println("1.Add Book");
			System.out.println("2.Find book by name");
			System.out.println("3.Update book details");
			System.out.println("4.Display All Book");
			System.out.println("5.Delete a Book");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			
			int ch=sc.nextInt();
			switch(ch) {
			case 1->addBook();
			case 2->FindBookByName();
			case 3->Update();
			case 4->Display();
			case 5->Delete();
			case 6->flag=false;
			default->System.out.println("Invalid choice");
			}
		}
	}
	private static void Delete() {
		 System.out.println("Enter Book Name to Delete");
		    String name = sc.next();
		    boolean found = false;

		    for (int i = 0; i < count; i++) {
		        if (books[i].bookName.equalsIgnoreCase(name)) {
		            found = true;
		            for (int j = i; j < count - 1; j++) {
		                books[j] = books[j + 1];
		            }
		            books[count - 1] = null;
		            count--;

		            System.out.println("Book Deleted Successfully!");
		            break;
		        }
		    }

		    if (!found) {
		        System.out.println("Book not found");
		    }
		}
	private static void Update() {
		System.out.println("Enter Book Name to Update");
	    String name = sc.next();
	    boolean found = false;

	    for (int i = 0; i < count; i++) {
	        if (books[i].bookName.equalsIgnoreCase(name)) {
	            found = true;

	            System.out.println("Book Found! Enter new details");

	            sc.nextLine(); 

	            System.out.println("Enter new author");
	            String author = sc.nextLine();

	            System.out.println("Enter new number of pages");
	            int pages = sc.nextInt();

	            System.out.println("Enter new price");
	            double price = sc.nextDouble();

	            books[i].author = author;
	            books[i].noOfPages = pages;
	            books[i].price = price;

	            System.out.println("Book Updated Successfully!");
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("Book not found");
	    }
	}
	private static void FindBookByName() {
		System.out.println("Enter book name");
		String name = sc.next();
		boolean flag=true;
		for(int i=0;i<count;i++) {
			if(books[i].bookName.equalsIgnoreCase(name)) {
				System.out.println("Book found");
				flag=false;
				System.out.println("-----------------------");
				books[i].displayInfo();
				System.out.println("-------------------------");
			}
		}
		if(flag) {
			System.out.println("book not found");
		}
	}
	private static void Display() {
		System.out.println("Book details");
		System.out.println("---------------------");
		for(int b=0;b<count;b++) {
			books[b].displayInfo();
			System.out.println("---------------------");
		}
	}
	private static void addBook() {
		sc.nextLine();
		System.out.println("Enter book name");
		String name=sc.next();
		System.out.println("Enter book Author");
		sc.nextLine();
		String author=sc.nextLine();
		System.out.println("Enter no of pages");
		int no=sc.nextInt();
		System.out.println("Enter book price");
		double price=sc.nextDouble();
		books[count++]=new Book(name, author, no, price);
		System.out.println("Books Added Successfully");
	}
	}


