//Algorithm:
//Input: Read the number n (how many Fibonacci numbers to print).
//Base Cases:
//If n is 0, return an empty list.
//If n is 1, return [0].
//Loop:
//Start from the first two numbers, 0 and 1.
//Keep adding the sum of the last two numbers to the list until n numbers are generated.
//Return: The list of Fibonacci numbers.


import java.util.Scanner;
import java.util.ArrayList;

public class FibonaciiSeries {

    // Method to generate Fibonacci series up to n numbers
    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> fibSeries = new ArrayList<>();
        
        if (n == 0) {
            return fibSeries; // Return empty list for n = 0
        }
        
        // Initialize the first two Fibonacci numbers
        fibSeries.add(0);
        if (n == 1) {
            return fibSeries; // Return [0] for n = 1
        }
        
        fibSeries.add(1); // Add the second Fibonacci number
        
        for (int i = 2; i < n; i++) {
            // Calculate the next Fibonacci number as sum of the last two
            int nextFib = fibSeries.get(i - 1) + fibSeries.get(i - 2);
            fibSeries.add(nextFib);
        }
        
        return fibSeries; // Return the list of Fibonacci numbers
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter the number of Fibonacci numbers to print: ");
        int n = sc.nextInt();
        
        // Get the Fibonacci series
        ArrayList<Integer> result = fibonacci(n);
        
        // Print the result
        System.out.println("Fibonacci series up to " + n + " numbers: " + result);
        
        // Close scanner
        sc.close();
    }
}


//Enter the number of Fibonacci numbers to print: 
//8
//Fibonacci series up to 8 numbers: [0, 1, 1, 2, 3, 5, 8, 13]
