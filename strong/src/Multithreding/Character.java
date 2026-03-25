package Multithreding;

import java.util.Scanner;

public class Character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		int[]arr=new int[256];
		for(char c:str.toCharArray()) {
			arr[c]++;
		}
		for(char c:str.toCharArray()) {
			if(arr[c]==1) {
				System.out.println(c);
				return;
			}
		}
		System.out.println((-1));	
	}

}
