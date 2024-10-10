//Algorithm:
//Input: Read the two numbers a and b.
//Base Case: If b is zero, return a as the GCD.
//Recursive Case: Replace a with b and b with a % b, and repeat until b becomes zero.
//Return: The GCD of the two numbers.


import java.util.Scanner;

public class GCD {

    // Method to compute the GCD using the Euclidean algorithm
    public static int gcd(int a, int b) {
        // Base case: if b is zero, GCD is a
        if (b == 0) {
            return a;
        }
        // Recursive case: gcd(b, a % b)
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter two numbers to find their GCD:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        
        // Compute and print the GCD
        int result = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
        
        // Close scanner
        sc.close();
    }
}


//Enter two numbers to find their GCD:
//a = 6
//b = 8
//The GCD of 6 and 8 is: 2

//Enter two numbers to find their GCD:
//a = 88
//b = 77
//The GCD of 88 and 77 is: 11

