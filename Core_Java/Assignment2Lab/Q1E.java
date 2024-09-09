/*
 e. Declare a method-local variable status of type boolean with the value true and 
 convert it to the corresponding wrapper class using Boolean.valueOf(). 
 (Hint: Use Boolean.valueOf(boolean)).
*/

public class Q1E {
    public static void main(String args[])
    {
        boolean status = false ;
        //local method variable 'status'

        Boolean statuswrapper = Boolean.valueOf(status);
        //conbverting boolean value to a boolean 

        System.out.println(status);
    }
    
}
