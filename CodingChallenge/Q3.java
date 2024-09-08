public class Q3 {
    
        public static void main(String[] args) {
            int rows = 5; // Number of rows for the pyramid
            char alphabet = 'A'; // Starting alphabet
    
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
    
                // Print alphabets
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(alphabet);
                }
    
                // Move to the next line
                System.out.println();
    
                // Move to the next alphabet
                alphabet++;
            }
        }
    }
    
    

