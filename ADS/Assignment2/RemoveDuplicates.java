//2. Remove Array Duplicates
//Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the array.
//
//Test Cases:
//
//Input: arr = [1, 1, 2]
//Output: 2
//Input: arr = [0, 0, 1, 1, 2, 2, 3, 3]
//Output: 4
//
//
//Algorithm:
//Initialize a pointer i at the start of the array.
//Traverse the array with pointer j starting from the second element.
//If the element at arr[j] is different from arr[i], move i forward and copy arr[j] to arr[i].
//After traversing the array, return i + 1 as the new length of the array.
		
		
package Ass2;

import java.util.Arrays;

public class RemoveDuplicates {

    // Method to remove duplicates from a sorted array and return the new length
    public static int removeDuplicates(int[] arr) {
        // If the array is empty, return 0
        if (arr.length == 0) {
            return 0;
        }
        
        int i = 0;  // Pointer for the unique elements
        
        // Traverse the array starting from the second element
        for (int j = 1; j < arr.length; j++) {
            // If current element is not the same as the last unique element
            if (arr[j] != arr[i]) {
                i++;                // Move the unique pointer forward
                arr[i] = arr[j];     // Update the unique element at i
            }
        }
        
        // Return the new length (i + 1 since i is 0-based index)
        return i + 1;
    }
    
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 1, 2};
        int newLength1 = removeDuplicates(arr1);
        System.out.println("New length: " + newLength1);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr1, newLength1)));
        
        // Test case 2
        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
        int newLength2 = removeDuplicates(arr2);
        System.out.println("New length: " + newLength2);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr2, newLength2)));
    }
}



//New length: 2
//Array after removing duplicates: [1, 2]
//New length: 4
//Array after removing duplicates: [0, 1, 2, 3]
