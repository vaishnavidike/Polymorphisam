package Stack;

import java.util.Arrays;
import java.util.Scanner;

public class Mystack {
	
		int[] arr; //--> default size
		public static final int default_size=10;
		
		public Mystack(int size) {
			this.arr=new int[size];
		}
		public Mystack() {
			this (default_size);
		}
		
		int ptr=-1;
		public boolean isEmpty() {
			return ptr==-1;
		}
		public boolean isFull() {
			return ptr==arr.length-1;
		}
		public boolean push(int data) {
			if(isFull()) {
				System.out.println("Stack is full...");
			}
			ptr++;
			arr[ptr]=data;
			return true;
		}
		public int pop() {
			if(isEmpty()) {
				System.out.println("Stack is Empty..");
			}
			int remove=arr[ptr--];
			return remove;
		}
		
		public void Display() {
			System.out.println("Output: "+Arrays.toString(arr));
		}
		public boolean Search(int find) {
			for(int i=0;i<=arr.length-1;i++) {
				if(arr[i]==find)
					return true;
			}
			return false;
		}
		public int[] Sort() {
			int[]sarr=new int[arr.length];
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<arr.length-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return sarr;
			
		}
		public static void main(String[] args) {
			Mystack m=new Mystack(5);
			m.push(5);
			m.push(1);
			m.push(2);
			m.push(4);
			m.push(3);
			
			m.Display();	
			System.out.println("pop element:"+m.pop());
			System.out.println("pop element:"+m.pop());
			
		}
		}

		
	
	


