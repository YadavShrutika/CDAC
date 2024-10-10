//Algorithm:
//Create a HashMap: Map each character to its frequency.
//Find the First Non-Repeated Character: Traverse the string and check the frequency of each character from the map.
//Return the Character if found; otherwise, return null.


import java.util.HashMap;
import java.util.Scanner;

public class Nonreapetedcharacter {

    // Method to find the first non-repeated character in a string
    public static Character findFirstNonRepeatedChar(String s) {
        // HashMap to store the frequency of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // First pass: Build the frequency map
        for (char ch : s.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        // Second pass: Find the first character with a count of 1
        for (char ch : s.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;  // Return the first non-repeated character
            }
        }
        
        return null;  // Return null if there is no non-repeated character
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        
        // Find and print the first non-repeated character
        Character result = findFirstNonRepeatedChar(input);
        
        if (result != null) {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
        
        // Close scanner
        sc.close();
    }
}


//Enter a string: 
//programming
//The first non-repeated character is: p
