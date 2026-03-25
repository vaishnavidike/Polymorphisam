//3.  write a java program to find first positive missing element of an arrat    ex --> [-1,0,1,3]output-->2


package Stack;
import java.util.Arrays;
import java.util.Scanner;
public class Positive {
	
	public static int findmissing(int[]arr) {
		int count=arr.length;
		for(int i=0;i<count;i++) {
			while(arr[i]>0 &&  arr[i]<=count && arr[arr[i]-1]!=arr[i]) {
				int temp=arr[arr[i]-1];
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			
		}
		for(int i=0;i<count;i++) {
			if(arr[i]!=i+1)
			{
				return i+1;
			}
		}
		return count+1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int[]arr=new int[sc.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter" +i+ "index of an array element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Output:"+Arrays.toString(arr));
		System.out.println("Missing no.:"+findmissing(arr));
	}

	
	
	
	
	}

