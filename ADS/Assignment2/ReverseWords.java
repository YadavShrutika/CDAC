//6. Reverse Words in a String
//Problem: Write a Java program to reverse the words in a given sentence.
//
//Test Cases:
//
//Input: "Hello World"
//Output: "World Hello"
//Input: "Java Programming"
//Output: "Programming Java"
//
//	
//	Algorithm:
//		Split the input sentence into words using split(" ").
//		Reverse the array of words.
//		Join the words back together using String.join() with a space " " as the delimiter.


package Ass2;

import java.util.Scanner;

public class ReverseWords {

    // Method to reverse words in a string
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Reverse the words array
        int left = 0;
        int right = words.length - 1;
        
        // Swap words using two-pointer technique
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            
            left++;
            right--;
        }
        
        // Join the reversed words back into a string
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test case 1
        System.out.println("Enter a sentence to reverse its words: ");
        String input = sc.nextLine();
        
        // Reverse the words in the input string
        String reversed = reverseWords(input);
        System.out.println("Reversed words: " + reversed);
        
        // Close scanner
        sc.close();
    }
}


//Enter a sentence to reverse its words: 
//java is best language
//Reversed words: language best is java

