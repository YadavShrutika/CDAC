//8. Array Manipulation
//Problem: Perform a series of operations to manipulate an array based on range update queries. Each query adds a value to a range of indices.
//
//Test Cases:
//
//Input: n = 5, queries = [[1, 2, 100], [2, 5, 100], [3, 4, 100]]
//Output: 200
//Input: n = 4, queries = [[1, 3, 50], [2, 4, 70]]
//Output: 120
//
//Algorithm:
//Initialize an array arr of size n + 1 with all elements as 0.
//For each query [a, b, k]:
//Add k to arr[a - 1].
//Subtract k from arr[b] (if b is within bounds).
//Calculate the prefix sum of the array to get the actual values after all updates.
//Find the maximum value in the resulting array.


package Ass2;

import java.util.Scanner;

public class ArrayManipulation {

    // Method to perform array manipulation and return the maximum value
    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 1];  // Create an array with size n+1

        // Apply each query using the difference array technique
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];
            
            // Update the start and end boundaries for the range
            arr[a - 1] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }

        // Calculate the prefix sum and find the maximum value
        long max = 0;
        long currentSum = 0;
        
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum > max) {
                max = currentSum;
            }
        }
        
        return max;  // Return the maximum value found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the number of queries
        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();

        // Input the queries
        int[][] queries = new int[q][3];
        System.out.println("Enter the queries (format: a b k): ");
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
        }

        // Perform array manipulation and print the maximum value
        long maxValue = arrayManipulation(n, queries);
        System.out.println("Maximum value after all operations: " + maxValue);

        sc.close();
    }
}

//Input: n = 5, queries = [[1, 2, 100], [2, 5, 100], [3, 4, 100]]
//Output: 200
//Input: n = 4, queries = [[1, 3, 50], [2, 4, 70]]
//Output: 120

