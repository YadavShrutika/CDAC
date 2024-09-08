public class Q6 {

    
        public static void main(String[] args) {
            int rows = 5; // Number of rows for the upper half of the diamond
            
            // Upper half of the diamond
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
    
                // Print increasing numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
    
                // Print decreasing numbers
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
    
                // Move to the next line
                System.out.println();
            }
    
            // Lower half of the diamond
            for (int i = rows - 1; i >= 1; i--) {
                // Print leading spaces
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
    
                // Print increasing numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
    
                // Print decreasing numbers
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    
    
    
}
