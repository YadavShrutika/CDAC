//6.	Write a program to find the missing number in an array of integers ranging from 1 to N.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array (N-1 elements)
        System.out.print("Enter the number of elements in the array (should be N-1): ");
        int nMinusOne = scanner.nextInt();
        int n = nMinusOne + 1; // N is the number of elements in the full range

        // Declare the array
        int[] arr = new int[nMinusOne];

        // Input elements for the array
        System.out.println("Enter " + nMinusOne + " integers (from 1 to " + n + " with one number missing):");
        for (int i = 0; i < nMinusOne; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Close the scanner as we no longer need user input
        scanner.close();

        // Find the missing number
        int missingNumber = findMissingNumber(arr, n);

        // Print the missing number
        System.out.println("The missing number is: " + missingNumber);
    }

    // Method to find the missing number in the array
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to N
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}


// PS D:\CoreJava\Assignment\Assignment6> javac Q6.java
// PS D:\CoreJava\Assignment\Assignment6> java Q6      
// Enter the number of elements in the array (should be N-1): 4
// Enter 4 integers (from 1 to 5 with one number missing):
// Element at index 0: 2
// Element at index 1: 3
// Element at index 2: 4
// Element at index 3: 1
// The missing number is: 5