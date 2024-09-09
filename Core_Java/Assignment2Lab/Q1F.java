/*
f. Declare a method-local variable strStatus of type String with the value "true" and 
convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).
*/

public class Q1F {
    public static void main(String args[])
    {
        String strStatus ="true";

        Boolean wrapper = Boolean.valueOf(strStatus);

        System.out.println(wrapper);
    }
    
}
