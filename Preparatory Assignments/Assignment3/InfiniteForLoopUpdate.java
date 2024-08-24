public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
/*expression be corrected?
D:\PreparatoryAssignments\Assignment3>javac InfiniteForLoopUpdate.java

D:\PreparatoryAssignments\Assignment3>java InfiniteForLoopUpdate
0
2
4

*/