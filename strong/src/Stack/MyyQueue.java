package Stack;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MyyQueue {

    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; 
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = IntStream.range(0, size)
                .map(n -> {
                    System.out.println("Enter element at index " + n + ": ");
                    return sc.nextInt();
                })
                .toArray();

        System.out.println("Unique number: " + findUnique(arr));

    }
}
