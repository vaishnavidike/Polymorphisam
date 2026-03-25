package Multithreding;

import java.util.Scanner;

public class Primenumber extends Thread {
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check (Prime):");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		System.out.println(count==2?"Prime":"Not Prime");
		
	}
	

}
