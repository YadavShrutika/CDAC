 /* c. Declare a method-local variable strStatus of type String with the value "true" and 
convert it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).*/

public class Q1C {
    public static void main(String args[])
    {
        String strstatus = "true";

        // creating menthid level local variable strstatus of type String

        boolean status = Boolean.parseBoolean(strstatus);

        //passing the value of String into the boolean to get boolean value

        System.out.println(status);

    }
}
    
/*
 String strstatus = "true";  op=true
 String strstatus = "false"; op=false
 String strstatus = "True";  op=false
 String strstatus = "False"; op=false
 String strstatus = " true"; op=false bcoz space
*/

