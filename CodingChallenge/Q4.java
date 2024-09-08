public class Q4 {
    

        public static void main(String[] args) {
            int rows = 5; // Number of rows for the triangle
    
            for (int i = 1; i <= rows; i++) {
                // Loop to print numbers and spaces
                for (int j = 1; j <= i; j++) {
                    // Print numbers at the boundaries or on the hypotenuse
                    if (j == 1 || j == i || i == rows) {
                        System.out.print(j);
                    } else {
                        // Print spaces inside the triangle
                        System.out.print(" ");
                    }
                }
                // Move to the next line
                System.out.println();
            }
        }
    
    
    
}
