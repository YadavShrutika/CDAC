//Algorithm:
//Input: Read the number n.
//Base Case:
//The factorial of 0 is 1.
//Compute Factorial:
//Multiply all integers from 1 to n.
//Return: The result of the multiplication is the factorial of the number.



import java.util.Scanner;

public class Factorial {

    // Method to compute the factorial of a number
    public static long factorial(int num) {
        if (num == 0) {
            return 1; // 0! is 1
        }
        
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;  // Multiply result by current number i
        }
        
        return result;  // Return the computed factorial
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test cases
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        
        // Output result
        System.out.println("Factorial of " + input + " is: " + factorial(input));
        
        // Close scanner
        sc.close();
    }
}


//Enter a number: 
//24
//Factorial of 24 is: -7835185981329244160

