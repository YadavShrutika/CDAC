public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 5); 
    } 
} 
/* Error to investigate: Why does this loop print unexpected numbers( it was printed first into syso (num).....bcoz in while num>0  and in do its num-- ,so it will print only 1)?
 What adjustments are needed to print the numbers from 1 to 5?
*/