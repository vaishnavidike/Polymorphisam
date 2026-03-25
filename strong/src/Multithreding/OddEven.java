package Multithreding;

import java.util.Scanner;

public class OddEven extends Thread
{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check(odd/even):");
		System.out.println(sc.nextInt()%2==0?"Even":"odd");
		
		
	}
}
