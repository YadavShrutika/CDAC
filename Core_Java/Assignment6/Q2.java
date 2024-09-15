// 2.	Declare a single-dimensional array of 5 integers inside the main method. 
// Define a method named acceptRecord to get input from the terminal into the array and 
// another method named printRecord to print the state of the array to the terminal.


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Declare a single-dimensional array of 5 integers
        int[] arr = new int[5];

        // Call the method to accept input into the array
        acceptRecord(arr);

        // Call the method to print the array
        printRecord(arr);
    }

    // Method to accept input from the user and store it in the array
    public static void acceptRecord(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();
    }

    // Method to print the current state of the array
    public static void printRecord(int[] arr) {
        System.out.println("\nCurrent state of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}


// PS D:\CoreJava\Assignment\Assignment6> javac Q2.java
// PS D:\CoreJava\Assignment\Assignment6> java Q2      
// Enter 5 integers:
// Enter value for index 0: 22
// Enter value for index 1: 11
// Enter value for index 2: 13
// Enter value for index 3: 14
// Enter value for index 4: 15

// Current state of the array:
// Element at index 0: 22
// Element at index 1: 11
// Element at index 2: 13
// Element at index 3: 14
// Element at index 4: 15