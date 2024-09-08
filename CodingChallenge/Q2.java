public class Q2 {
    

        public static void main(String[] args) {
            int rows = 5; // Number of rows for the inverted pyramid
            
            for (int i = rows; i >= 1; i--) {
                // Print leading spaces
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                
                // Print stars and spaces to create the hollow effect
                for (int j = 1; j <= (2 * i - 1); j++) {
                    if (j == 1 || j == (2 * i - 1) || i == rows) {
                        // Print stars at the boundaries and the top row
                        System.out.print("*");
                    } else {
                        // Print spaces inside the pyramid
                        System.out.print(" ");
                    }
                }
                
                // Move to the next line
                System.out.println();
            }
        }
    }





        

