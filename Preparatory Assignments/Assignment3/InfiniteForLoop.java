public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 
*/Why does this loop run infinitely? How should the loop control variable be adjusted?
This code will result in an infinite loop because the loop control variable `i` is decremented instead of incremented.
 The condition `i < 5` will always be true, causing an infinite loop.
 */