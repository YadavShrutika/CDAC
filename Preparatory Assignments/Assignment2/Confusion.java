//q.23
class Confusion{
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
}

D:\PreparatoryAssignments\Assignment2>javac confusion.java

D:\PreparatoryAssignments\Assignment2>java confusion
Error: Could not find or load main class confusion
Caused by: java.lang.NoClassDefFoundError: Confusion (wrong name: confusion)