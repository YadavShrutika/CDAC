//5.	Write a program to find the intersection of two single-dimensional arrays.

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Q5 {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        // Input elements for the first array
        System.out.println("Enter " + n1 + " integers for the first array:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Element at index " + i + ": ");
            arr1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        // Input elements for the second array
        System.out.println("Enter " + n2 + " integers for the second array:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Element at index " + i + ": ");
            arr2[i] = scanner.nextInt();
        }

        // Close the scanner as we no longer need user input
        scanner.close();

        // Find the intersection of the two arrays
        int[] intersection = findIntersection(arr1, arr2);

        // Print the intersection array
        System.out.println("\nIntersection of the two arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    // Method to find the intersection of two arrays
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Use a HashSet to store elements of the first array
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // Use a HashSet to store the intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the set to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }
}


// PS D:\CoreJava\Assignment\Assignment6> javac Q5.java
// PS D:\CoreJava\Assignment\Assignment6> java Q5      
// Enter the number of elements in the first array: 3
// Enter 3 integers for the first array:
// Element at index 0: 1
// Element at index 1: 3
// Element at index 2: 5
// Enter the number of elements in the second array: 4
// Enter 4 integers for the second array:
// Element at index 0: 3
// Element at index 1: 5
// Element at index 2: 6
// Element at index 3: 8

// Intersection of the two arrays:
// 3 5