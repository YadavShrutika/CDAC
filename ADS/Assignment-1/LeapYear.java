//Algorithm:
//Input: A year y.
//Check:
//If y is divisible by 4 and (either it is not divisible by 100 or it is divisible by 400), then it is a leap year.
//Otherwise, it is not a leap year.


import java.util.Scanner;

public class LeapYear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If divisible by 100, check if also divisible by 400
                return year % 400 == 0;
            } else {
                return true;  // Divisible by 4 but not by 100
            }
        }
        return false;  // Not divisible by 4
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter a year to check if it is a leap year: ");
        int year = sc.nextInt();
        
        // Check and print the result
        boolean result = isLeapYear(year);
        System.out.println("Is the year " + year + " a leap year? " + result);
        
        // Close scanner
        sc.close();
    }
}

//Enter a year to check if it is a leap year: 
//2000
//Is the year 2000 a leap year? true
