//Algorithm:
//Input: Read the number num.
//Initialize:
//Store the original number to compare later.
//Find the number of digits n in num.
//Loop through the digits:
//Extract each digit from the number.
//Raise each digit to the power of n and add to a sum.
//Check: If the sum equals the original number, return true; otherwise, return false.



import java.util.Scanner;

public class Armstrong {
    
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;  // Store the original number
        int sum = 0;
        int n = Integer.toString(num).length();  // Find number of digits
        
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            sum += Math.pow(digit, n);  // Add the digit raised to the power of n
            num /= 10;  // Remove the last digit
        }
        
        return sum == originalNum;  // Check if the sum is equal to the original number
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test cases
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        
        // Output result
        if (isArmstrong(input)) {
            System.out.println(input + " is an Armstrong number.");
        } else {
            System.out.println(input + " is not an Armstrong number.");
        }
        
        // Close scanner
        sc.close();
    }
}



//o/p=Enter a number: 
//	78
//	78 is not an Armstrong number.
