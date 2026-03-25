// 4. find unique number from an array
//ex. [4,2,5,2,4]-->5

package Stack;
public class UniqueNo {
	
	    public static void main(String[] args) {
	        int arr[] = {4, 2, 5, 2, 4};

	        int unique = findUnique(arr);
	        System.out.println("Unique number: " + unique);
	    }
	    static int findUnique(int arr[]) {
	        int result = 0;

	        for (int num : arr) {
	            result ^= num; 
	        }
	        return result; 
	    }
	}



