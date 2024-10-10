
//10. Array Left Rotation
//Problem: Write a Java program to rotate an array to the left by d positions.
//
//Test Cases:
//
//Input: arr = [1, 2, 3, 4, 5], d = 2
//Output: [3, 4, 5, 1, 2]
//Input: arr = [10, 20, 30, 40], d = 1
//Output: [20, 30, 40, 10]
//		
//		Algorithm:
//			Normalize d:
//			If d is greater than or equal to the length of the array, set d = d % n, where n is the length of the array.
//			Reverse the entire array.
//			Reverse the first n - d elements.
//			Reverse the last d elements.

package Ass2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {

    // Method to reverse a part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to perform left rotation
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        // Normalize d in case it's greater than the array length
        d = d % n; 

        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse the first n - d elements
        reverse(arr, 0, n - d - 1);
        // Reverse the last d elements
        reverse(arr, n - d, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the number of positions to rotate
        System.out.println("Enter the number of positions to rotate: ");
        int d = sc.nextInt();

        // Perform left rotation
        leftRotate(arr, d);

        // Print the rotated array
        System.out.println("Array after left rotation: " + Arrays.toString(arr));

        // Close scanner
        sc.close();
    }
}

//Enter the number of elements in the array: 
//4
//Enter the elements of the array: 
//4 8 2 6
//Enter the number of positions to rotate: 
//3
//Array after left rotation: [6, 4, 8, 2]

