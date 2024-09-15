//3.	Write a program to find the maximum and minimum values in a single-dimensional array of integers.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Declare a single-dimensional array of integers
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Get the size of the array
        int[] arr = new int[n];

        // Accept input from the user to fill the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Close the scanner as we no longer need user input
        scanner.close();

        // Call methods to find the maximum and minimum values
        int maxValue = findMax(arr);
        int minValue = findMin(arr);

        // Print the maximum and minimum values
        System.out.println("\nMaximum value in the array: " + maxValue);
        System.out.println("Minimum value in the array: " + minValue);
    }

    // Method to find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max;
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }
        return min;
    }
}


// PS D:\CoreJava\Assignment\Assignment6> javac Q3.java 
// PS D:\CoreJava\Assignment\Assignment6> java Q3      
// Enter the number of elements in the array: 5
// Enter 5 integers:
// Element at index 0: 2
// Element at index 1: 6
// Element at index 2: 2
// Element at index 3: 9
// Element at index 4: 5

// Maximum value in the array: 9
// Minimum value in the array: 2