import java.util.Scanner;

public class Squareroot {
    
    // Method to find the square root using integer approximation (binary search)
    public static int findSquareRoot(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative numbers don't have real square roots.");
        }
        
        if (x == 0 || x == 1) {
            return x; // The square root of 0 or 1 is itself
        }
        
        int low = 1, high = x, result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is the perfect square root
            if (mid * mid == x) {
                return mid;
            }
            
            // If mid squared is less than x, move to the right half
            if (mid * mid < x) {
                low = mid + 1;
                result = mid;  // Update result as this might be the floor value of sqrt
            } else {
                // If mid squared is greater, move to the left half
                high = mid - 1;
            }
        }
        
        return result;  // The integer approximation of sqrt(x)
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test case
        System.out.println("Enter a number to find its square root: ");
        int x = sc.nextInt();
        
        // Find and print the square root
        int result = findSquareRoot(x);
        System.out.println("The integer approximation of the square root of " + x + " is: " + result);
        
        // Close scanner
        sc.close();
    }
}


//Enter a number to find its square root: 
//789
//The integer approximation of the square root of 789 is: 28

