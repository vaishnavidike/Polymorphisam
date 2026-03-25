package xylem;
import java.util.Scanner;
public class Phloem {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int n = num;
	        int first = n % 10;   
	        n = n / 10;

	        int meanSum = 0;

	        
	        while (n > 9) {
	            meanSum += n % 10;
	            n = n / 10;
	        }

	        int last = n; 

	        int extremeSum = first + last;

	        int sum = 0;
			System.out.println((last+num)==sum?"xyloem":"phloem");
	    }
	}


