package basic;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Tests {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size:");
		int[]arr=IntStream.range(0, sc.nextInt())
				.map(n->{System.out.println("Enter " +n+ "index of an array elemnet:");return sc.nextInt();})
				.toArray();
		System.out.println("Array output:"+Arrays.toString(arr));
		System.out.println("Enter first and last index:");
		isSwap(arr,sc.nextInt(),sc.nextInt());
		System.out.println("Array swap output:"+Arrays.toString(arr));
								
	}
	public static void isSwap(int[]arr , int s, int e) {
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		
	}

}
