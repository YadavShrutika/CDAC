// 1.	Declare a single-dimensional array of 5 integers inside the main method. Traverse the array to print the default values.
//  Then accept records from the user and print the updated values of the array.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Declare a single-dimensional array of 5 integers
        int[] arr = new int[5];

        // Print the default values of the array (which will be 0 for integers)
        System.out.println("Default values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Create a Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);

        // Accept new values from the user and update the array
        System.out.println("\nEnter 5 integers to update the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Print the updated values of the array
        System.out.println("\nUpdated values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Close the scanner
        scanner.close();
    }
}


// PS D:\CoreJava\Assignment\Assignment6> javac Q1.java
// PS D:\CoreJava\Assignment\Assignment6> java Q1
// Default values of the array:
// Element at index 0: 0
// Element at index 1: 0
// Element at index 2: 0
// Element at index 3: 0
// Element at index 4: 0

// Enter 5 integers to update the array:
// Enter value for index 0: 2
// Enter value for index 1: 4
// Enter value for index 2: 6
// Enter value for index 3: 8
// Enter value for index 4: 9

// Updated values of the array:
// Element at index 0: 2
// Element at index 1: 4
// Element at index 2: 6
// Element at index 3: 8
// Element at index 4: 9