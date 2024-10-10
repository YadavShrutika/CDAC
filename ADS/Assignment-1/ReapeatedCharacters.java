//Algorithm:
//Input: A string s.
//Create a Frequency Map: Use a HashMap to count the occurrences of each character.
//Find Repeated Characters: Iterate through the map and store characters with a count greater than 1.
//Return the List of Repeated Characters.


import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class ReapeatedCharacters {

    // Method to find repeated characters in a string
    public static ArrayList<Character> findRepeatedChars(String s) {
        // HashMap to store frequency of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Iterate through the string to populate the map
        for (char ch : s.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        // ArrayList to store repeated characters
        ArrayList<Character> repeatedChars = new ArrayList<>();
        
        // Find characters that appear more than once
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                repeatedChars.add(ch);
            }
        }
        
        return repeatedChars;  // Return the list of repeated characters
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        
        // Find and print repeated characters
        ArrayList<Character> result = findRepeatedChars(input);
        System.out.println("Repeated characters: " + result);
        
        // Close scanner
        sc.close();
    }
}


//Enter a string: 
//progrramming
//Repeated characters: [r, g, m]
//
