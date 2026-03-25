package Practice;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import Collection.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++) {
			System.out.print("Enter " +i+ " element of linked List");
			l.add(sc.nextInt());
		}
		System.out.println("output linkedList l: "+1);
		
		
	}

}
