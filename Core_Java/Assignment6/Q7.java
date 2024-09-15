// 7.	Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor.
//  Define methods named acceptRecord and printRecord within the class and test their functionality.


import java.util.Scanner;

public class Q7 {
    // Field: Single-dimensional array
    private int[] arr;

    // Constructor to initialize the array
    public Q7(int size) {
        arr = new int[size];
    }

    // Method to accept records (input) from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        // Close the scanner as we no longer need user input
        scanner.close();
    }

    // Method to print the array records
    public void printRecord() {
        System.out.println("\nArray elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        // Create an instance of ArrayHandler with a specific size
        Q7 handler = new Q7(5);

        // Call methods to accept and print records
        handler.acceptRecord();
        handler.printRecord();
    }
}


// PS D:\CoreJava\Assignment\Assignment6> java Q7      
// Enter 5 integers:
// Element at index 0: 4
// Element at index 1: 9
// Element at index 2: 8
// Element at index 3: 7
// Element at index 4: 6

// Array elements:
// Element at index 0: 4
// Element at index 1: 9
// Element at index 2: 8
// Element at index 3: 7
// Element at index 4: 6