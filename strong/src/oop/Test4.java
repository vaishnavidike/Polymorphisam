package oop;

public class Test4 {
	public static void main(String[] args) {
		String str="Hello Geeks";
		int[] arr=new int[256];
		for(int i=0;i<=str.length()-1;i++) {
			arr[str.charAt(i)]++;
			
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>0) {
				System.out.println((char)i+"+"+arr[i]);
			}
		}
	}

}
