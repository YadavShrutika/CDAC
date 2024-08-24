public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count;
         // count=5;		
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
/*Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly? bcoz count not initialized...s

D:\PreparatoryAssignments\Assignment3>javac UninitializedWhileLoop.java
UninitializedWhileLoop.java:6: error: variable count might not have been initialized
        while (count < 10) {
               ^
1 error




D:\PreparatoryAssignments\Assignment3>javac UninitializedWhileLoop.java

D:\PreparatoryAssignments\Assignment3>java UninitializedWhileLoop
5
6
7
8
9
*/ 