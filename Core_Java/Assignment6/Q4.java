//4.	Write a program to remove duplicate elements from a single-dimensional array of integers.


import java.util.Scanner;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Get the size of the array

        // Declare and initialize the array
        int[] arr = new int[n];

        // Accept input from the user to fill the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Close the scanner as we no longer need user input
        scanner.close();

        // Remove duplicate elements from the array
        int[] uniqueArray = removeDuplicates(arr);

        // Print the array without duplicates
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }

    // Method to remove duplicates from the array
    public static int[] removeDuplicates(int[] arr) {
        // Sort the array first
        Arrays.sort(arr);

        // Count the number of unique elements
        int uniqueCount = 1; // Start with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array to store unique elements
        int[] result = new int[uniqueCount];
        result[0] = arr[0]; // Add the first element to the result array

        int index = 1; // Index for the result array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index++] = arr[i]; // Add unique elements
            }
        }

        return result;
    }
}




// PS D:\CoreJava\Assignment\Assignment6> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment6> java Q4      
// Enter the number of elements in the array: 6
// Enter 6 integers:
// Element at index 0: 22
// Element at index 1: 99
// Element at index 2: 67
// Element at index 3: 22
// Element at index 4: 55
// Element at index 5: 55

// Array after removing duplicates:
// 22 55 67 99