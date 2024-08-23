/*
public class Switch { {
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}

D:\PreparatoryAssignments\Assignment2>javac Switch.java
Switch.java:4: error: patterns in switch statements are a preview feature and are disabled by default.
        switch(score) {
              ^
  (use --enable-preview to enable patterns in switch statements)
Switch.java:5: error: constant label of type int is not compatible with switch selector type double
            case 100:
                 ^
Switch.java:8: error: constant label of type int is not compatible with switch selector type double
            case 85:
*/
	
			public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 
 
 
 D:\PreparatoryAssignments\Assignment2>javac Switch.java
Switch.java:39: error: duplicate case label
            case 5:
            ^
1 error
