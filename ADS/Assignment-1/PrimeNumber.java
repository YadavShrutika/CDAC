
//Algorithm:
//Input: Read the number num.
//Base Cases:
//If num is less than 2, it is not prime.
//2 is the smallest prime number.
//Check Divisibility:
//For each number i from 2 to the square root of num, check if num is divisible by i. If it is divisible, then num is not prime.
//Result:
//If no divisors are found, the number is prime; otherwise, it is not.


import java.util.Scanner;

public class PrimeNumber {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle base cases
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 is prime
        }
        
        // Check for factors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so not prime
            }
        }
        
        return true; // No divisors found, num is prime
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test cases
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        
        // Output result
        if (isPrime(input)) {
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }
        
        // Close scanner
        sc.close();
    }
}



//Enter a number: 
//7
//7 is a prime number.

