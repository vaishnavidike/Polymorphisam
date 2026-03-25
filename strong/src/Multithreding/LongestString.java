package Multithreding;

import java.util.Scanner;

public class LongestString {
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		String LongWord="";
		String[]arr=str.split(" ");
		
		for(String s:arr) {
			if(s.length()>LongWord.length()) 
			{
				LongWord=s;	
			}
		}
		System.out.println("longest word: "+LongWord);
	}	
}


