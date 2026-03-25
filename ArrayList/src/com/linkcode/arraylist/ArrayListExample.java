package com.linkcode.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
//		int arr[] = {10,20,30,40};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			
//		}
//		//Enhanced for loop
//		for(int a:arr) {
//			System.out.println(a);
//		}
		ArrayList obj =new ArrayList();
		obj.add(10);
		obj.add(true);
		obj.add("hello");
		obj.add(2,40);
		
		System.out.println(obj);
		System.out.println(obj.get(3));
		
		//1 normal for loop
		
//		for(int i=0;i<obj.size();i++) {
//			System.out.println(obj.get(i));
//		}
		System.out.println("===========================");
//		//2 enhanced for loop
//		for(Object a :obj) {
//			System.out.println(a);
//		}
		//3 for each loop
		obj.forEach(val->System.out.println(val));
		
		//4.
		obj.forEach(System.out::println);
	}

}
