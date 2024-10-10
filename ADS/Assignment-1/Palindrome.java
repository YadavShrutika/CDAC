//Algorithm:
//Input: An integer x.
//Base Case: If x < 0, return false (since negative numbers are not palindromes).
//Reverse Integer: Extract digits from x and construct the reversed number.
//Check: If the reversed integer is equal to the original, return true; otherwise, return false.


import java.util.Scanner;

public class Palindrome {

    // Method to check if an integer is a palindrome
    public static boolean isPalindrome(int x) {
        // If the number is negative, it's not a palindrome
        if (x < 0) {
            return false;
        }
        
        // Store the original value of x
        int original = x;
        int reversed = 0;
        
        // Reverse the integer
        while (x != 0) {
            int digit = x % 10;          // Get the last digit
            reversed = reversed * 10 + digit;  // Add the digit to the reversed number
            x /= 10;                     // Remove the last digit from x
        }
        
        // Check if the reversed number is equal to the original
        return original == reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter an integer to check if it is a palindrome: ");
        int input = sc.nextInt();
        
        // Check and print the result
        boolean result = isPalindrome(input);
        System.out.println("Is the number a palindrome? " + result);
        
        // Close scanner
        sc.close();
    }
}


//Enter an integer to check if it is a palindrome: 
//121
//Is the number a palindrome? true
//		
//		Enter an integer to check if it is a palindrome: 
//
//			123
//			Is the number a palindrome? false


