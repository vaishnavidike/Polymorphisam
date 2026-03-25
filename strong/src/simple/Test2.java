package simple;
import java.util.Scanner;
public class Test2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size:");
		
		int[]arr = new int[sc.nextInt()];
		
		for(int i= arr.length-1; i>=0; i--) {
			System.out.println(arr(i));
		}
		
	}

	private static char[] arr(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
