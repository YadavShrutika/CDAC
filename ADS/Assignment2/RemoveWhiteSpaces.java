//3. Remove White Spaces from String
//Problem: Write a Java program to remove all white spaces from a given string.
//
//Test Cases:
//
//Input: "Hello World"
//Output: "HelloWorld"
//Input: "  Java   Programming  "
//Output: "JavaProgramming"
//
//	
//	
//	Algorithm:
//		Use the replaceAll("\\s+", "") method to remove all white spaces from the input string.
//		Return the new string without spaces.



package Ass2;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    // Method to remove white spaces from a string
    public static String removeWhiteSpaces(String str) {
        // Use replaceAll to remove all spaces
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case 1
        System.out.println("Enter a string to remove white spaces: ");
        String input = sc.nextLine();
        
        // Call the method to remove white spaces
        String result = removeWhiteSpaces(input);
        System.out.println("String after removing white spaces: " + result);
        
        // Close scanner
        sc.close();
    }
}



//Enter a string to remove white spaces: 
//java program
//String after removing white spaces: javaprogram

