//2. write a java program to find the missing element of an array [0,1,2]-->Output - 2

package Stack;
import java.util.Scanner;
public class Array {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        
	        int arr[] = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        
	        int missing = findMissing(arr);
	        System.out.println("Missing Element = " + missing);

	        sc.close();
	    }

	    static int findMissing(int arr[]) {
	        int n = arr.length;
	        int expectedSum = n * (n + 1) / 2;  
	        int actualSum = 0;

	        for (int num : arr) {
	            actualSum += num;
	        }

	        return expectedSum - actualSum;
	    }
	}



