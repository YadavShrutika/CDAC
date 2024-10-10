//9. String Palindrome
//Problem: Write a Java program to check if a given string is a palindrome.
//
//Test Cases:
//
//Input: "madam"
//Output: true
//Input: "hello"
//Output: false
//Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for each:
//
//	Algorithm:
//		Convert the string to lower case.
//		Initialize two pointers: left at the start and right at the end of the string.
//		While left < right:
//		If the characters at left and right are not the same, return false.
//		Increment left and decrement right.
//		If the loop completes, return true.


package Ass2;

import java.util.Scanner;

public class Stringpalindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lower case for case-insensitivity
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It is a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test case 1
        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();

        // Check if the input string is a palindrome
        boolean result = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + result);

        // Close scanner
        sc.close();
    }
}


//Enter a string to check if it's a palindrome: 
//aba
//Is the string a palindrome? true

