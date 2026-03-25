package com.linkcode.encapsulation;

import java.util.Scanner;

public class Bank {
	static Scanner sc=new Scanner(System.in);
	static Customer cust1;
	
	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			System.out.println("------WELCOME TO SBI------");
			System.out.println("1. Create new Account");
			System.out.println("2. Cheak Balance");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Deposite Money");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1->{
				System.out.println("Enter your name:");
				String name=sc.next();
				System.out.println("Enter your Mobile:");
				long mobile=sc.nextLong();
				System.out.println("Enter your Address:");
				String add=sc.next();
				System.out.println("Enter your Amount: ");
				double amount=sc.nextDouble();
				System.out.println("Genrating Account no:");
				int accno=(int)(Math.random()*10000);
				System.out.println("Account no:"+accno);
				System.out.println("Enter password");
				String pass=sc.next();
				cust1=new Customer(accno, name, mobile, add, amount,pass);
				System.out.println("Account Created Successfully");
			}
			case 2->{
				System.out.println("Available Balance:"+cust1.getbankbalance());
			}
      		case 3->{
      			System.out.println("Enter account no");
      			int acc=sc.nextInt();
      			System.out.println("Enter Password");
      			String pass=sc.next();
      			if(acc==cust1.getaccno()&&pass.equals(cust1.getPass())) {
      				System.out.println("Enter Amount to withdraw:");
      				double amount=sc.nextDouble();
      				if(cust1.getbankbalance()>amount) {
      					cust1.withdraw(amount);
      					
      				}else {
      					System.out.println("Low Bank Balance");
      				}
      				
      			}
      			else {
      				System.out.println("User not present or invalid pin");
      			}
      		}
     		case 4->{
     		    System.out.println("Enter account no:");
     		    int acc = sc.nextInt();

     		    System.out.println("Enter Password:");
     		    String pass = sc.next();

     		    if (acc == cust1.getaccno() && pass.equals(cust1.getPass())) {
     		        System.out.println("Enter Amount to Deposit:");
     		        double amount = sc.nextDouble();

     		        cust1.deposit(amount);
     		        System.out.println("Amount Deposited Successfully");
     		    } else {
     		        System.out.println("Invalid Account or Password");
     		    }
     		}
    
			case 5->{
				flag=false;
			}
			}
			
			}
		}
	}


