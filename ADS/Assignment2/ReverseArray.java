//5. Reverse Array in Place
//Problem: Write a Java program to reverse an array in place.
//
//Test Cases:
//
//Input: arr = [1, 2, 3, 4]
//Output: [4, 3, 2, 1]
//Input: arr = [7, 8, 9]
//Output: [9, 8, 7]
//
//		
//		Algorithm:
//			Initialize left to 0 and right to arr.length - 1.
//			While left < right:
//			Swap the elements at arr[left] and arr[right].
//			Increment left and decrement right.
//			The array will be reversed in place by the time the pointers cross.



package Ass2;

import java.util.Arrays;

public class ReverseArray {

    // Method to reverse the array in place
    public static void reverseArrayInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        // Swap elements while left index is less than right index
        while (left < right) {
            // Swap the elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 3, 4};
        reverseArrayInPlace(arr1);
        System.out.println("Reversed array: " + Arrays.toString(arr1));
        
        // Test case 2
        int[] arr2 = {7, 8, 9};
        reverseArrayInPlace(arr2);
        System.out.println("Reversed array: " + Arrays.toString(arr2));
    }
}


//Reversed array: [4, 3, 2, 1]
//Reversed array: [9, 8, 7]

