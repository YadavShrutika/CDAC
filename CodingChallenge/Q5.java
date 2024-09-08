public class Q5 {
  

        public static void main(String[] args) {
            int rows = 5; // Number of rows for the pyramid
    
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
    
                // Print the first half of the palindrome (increasing part)
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
    
                // Print the second half of the palindrome (decreasing part)
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    
    
    
}
