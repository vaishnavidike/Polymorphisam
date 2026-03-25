package Stack;

import java.util.Arrays;

public class MyQueue {
	
	int[] arr;
	public static final int defualt_size=10;
	
	public MyQueue(int size) {
		this.arr=new int[size];
	}
	public MyQueue()
	{	
		this(defualt_size);
	}
	int ptr=0;
	public boolean isEmpty() {
		return ptr==0;	
	}
	public boolean isFull() {
		return ptr==arr.length;
	}
	public boolean add(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		
		arr[ptr]=data;
		ptr++;
		return true;
	}
	public int remove(int data) {
		if(isEmpty()) {
			System.out.println("Queue is Empty..");
		}
		ptr--;
		int remove=arr[0];
		for(int i=1;i<=ptr;i++) {
			arr[i-1]=arr[i];
		}
		return remove;
	}
	
	public void Display() {
		System.out.println("Output:" +Arrays.toString(arr));
	}
	public static void main(String[] args) {
		MyQueue m=new MyQueue(4);
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		
	
		m.Display();
		
		m.remove(defualt_size);
		m.Display();
	
	}

	}


