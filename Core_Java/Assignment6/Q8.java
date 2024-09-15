//8.	Modify the previous assignment to use getter and setter methods instead of acceptRecord and printRecord.


import java.util.Scanner;

public class Q8 {
    // Field: Single-dimensional array
    private int[] arr;

    // Constructor to initialize the array
    public Q8(int size) {
        arr = new int[size];
    }

    // Setter method to set the entire array
    public void setArray(int[] newArray) {
        if (newArray.length == arr.length) {
            arr = newArray;
        } else {
            System.out.println("Error: Array length mismatch.");
        }
    }

    // Getter method to get the entire array
    public int[] getArray() {
        return arr;
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
        Q8 handler = new Q8(5);

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[5];

        // Input values from the user and set the array using the setter method
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Element at index " + i + ": ");
            inputArray[i] = scanner.nextInt();
        }

        // Set the array in the ArrayHandler object
        handler.setArray(inputArray);

        // Print the array using the printRecord method
        handler.printRecord();

        // Close the scanner as we no longer need user input
        scanner.close();
    }
}



// PS D:\CoreJava\Assignment\Assignment6> java Q8      
// Enter 5 integers:
// Element at index 0: 7
// Element at index 1: 5
// Element at index 2: 8
// Element at index 3: 4
// Element at index 4: 9

// Array elements:
// Element at index 0: 7
// Element at index 1: 5
// Element at index 2: 8
// Element at index 3: 4