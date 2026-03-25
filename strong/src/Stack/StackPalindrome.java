 // 1. Write java program to create custom stack and check the stack is palindrome or not
package Stack;

import java.util.Scanner;

class CustomStack {
    int top = -1;
    int size;
    int stack[];

    CustomStack(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }
    boolean isPalindrome() {
        int left = 0;
        int right = top;

        while (left < right) {
            if (stack[left] != stack[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class StackPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        CustomStack cs = new CustomStack(size);

        System.out.println("Enter stack elements:");
        for (int i = 0; i < size; i++) {
            cs.push(sc.nextInt());
        }

        if (cs.isPalindrome()) {
            System.out.println("Stack is Palindrome");
        } else {
            System.out.println("Stack is Not Palindrome");
        }

        sc.close();
    }
}



