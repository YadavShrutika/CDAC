package Ass2;

import java.util.Scanner;

public class ReverseString {

    // Method 1: Using StringBuilder to reverse a string
    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method 2: Manual iteration to reverse a string
    public static String reverseManually(String str) {
        String reversed = "";
        // Traverse the string from the end to the start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Append each character to reversed
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test case 1
        System.out.println("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Reverse using StringBuilder
        String reversed1 = reverseUsingStringBuilder(input);
        System.out.println("Reversed string (using StringBuilder): " + reversed1);

        // Reverse using manual iteration
        String reversed2 = reverseManually(input);
        System.out.println("Reversed string (using manual method): " + reversed2);

        // Close scanner
        sc.close();
    }
}


//Enter a string to reverse: 
//programming
//Reversed string (using StringBuilder): gnimmargorp
//Reversed string (using manual method): gnimmargorp
