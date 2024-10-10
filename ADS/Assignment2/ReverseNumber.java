//7. Reverse a Number
//Problem: Write a Java program to reverse a given number.
//
//Test Cases:
//
//Input: 12345
//Output: 54321
//Input: -9876
//Output: -6789
//
//Algorithm:
//Initialize reversed to 0.
//While num != 0:
//Extract the last digit: digit = num % 10.
//Append the digit to the reversed number: reversed = reversed * 10 + digit.
//Update the number: num = num / 10.
//After the loop ends, return the reversed number with the appropriate sign.
		
		
package Ass2;

import java.util.Scanner;

public class ReverseNumber {

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        int sign = (num < 0) ? -1 : 1;  // Keep track of sign

        // Make the number positive for processing
        num = Math.abs(num);
        
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Append the digit in reverse
            num /= 10;  // Remove the last digit from the original number
        }

        // Return the reversed number with the correct sign
        return sign * reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test case 1
        System.out.println("Enter a number to reverse: ");
        int input = sc.nextInt();

        // Reverse the input number
        int reversed = reverseNumber(input);
        System.out.println("Reversed number: " + reversed);

        // Close scanner
        sc.close();
    }
}


//Enter a number to reverse: 
//346789
//Reversed number: 987643

