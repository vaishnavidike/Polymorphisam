package Arraybasic;
import java.util.Arrays;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		// an array is collection of homogeneous data  types
		//homogeneous-> same kind of data
		/*Syntax --> DataType referance Variable(ArrayName) = Cases;
		/* array declaration;
		 * case 1 -> direct
		 *   DataType RefVar(ArrayNAme) = {E1,E2,E3....En};
		 * case 2 -> Indirect
		 *   DataType Refvar(ArrayName) = new dataType[arraysize];
		 * case 3 -> Using stream
		 * 
		 * Insert elements
		 * case 1: using range.map method
		 * case 2: Using for loop
		 * 
		 * print element
		 * case 1: for loop
		 * case 2: ForEach(Enhance)
		 * case 3: Arrays.toString(ArraysName)
		 */
		
		/*int[] arr = {1,2,3,4};
		System.out.println("For Loop");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]+" ");
			
		}
		System.out.println("-----------------------");
		System.out.println("Print An Array using ForEach Loop");
		
		for(int x:arr) {
			System.out.println(x+" ");
		}
		System.out.println("------------------------");
		System.out.println("Print an array using Arrays class");
		System.out.println(Arrays.toString(arr));
		*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Array size:");
		
		int[] arr=new int[sc.nextInt()];
		
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println("Enter "+i+" index of an array element:");
			arr[i]=sc.nextInt();
		}
		
		/*for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]+" ");
		}*/
		
		
		/*for(int x:arr) {
			System.out.println(x+" ");
		}*/
		
		/*System.out.println("an array output arr :" +Arrays.toString(arr));
		
		
		
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Array size:");
		int[] arr=new int[sc.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter "+1+" index of an array element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array output : "+Arrays.toString(arr));
		
		for(int i=0;i<=arr.length-1;i++) {
			if(isPrime(arr[i])==true) {
				System.out.println(arr[i]+"is prime number");
			}
			else {
				System.out.println(arr[i]+"is not prime number" );
			}
			
			System.out.println("-------------------------------");
			System.out.println("Rev array output:"+Arrays.toString(isRev(arr)));
			
//			for(int i=arr.length-1;i>=0;i--) {
//				System.out.println(arr[i]+" ");
//			}
			
			System.err.println("Enter element to find:");
			System.out.println(isFind(arr,sc.nextInt())==true?"Found":"Not Found");
			
			System.out.println("output sort:"+Arrays.toString(isSort(arr)));
			
			System.out.println("Max elemnt:"+isMax(arr));
		}
	}
	
	public static boolean isPrime(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++) {
			
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		
		return false;
	}
	public static int[] isRev(int[]arr) {
		int[] narr=new int[arr.length];
		for(int i=arr.length-1, j=0;i>=0;i--) {
			narr[j++]=arr[i];
	
		}
		return narr;
		
	}
	public static boolean isFind(int[]arr,int find) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==find)
				return true;
		}
		return false;
	}
	
	public static int[] isSort(int[]arr) {
		int[] narr=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		return arr;
	}
	public static int isMax(int[]arr) {
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

}
