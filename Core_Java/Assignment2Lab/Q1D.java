/*d. Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt to convert it to a boolean. 
(Hint: parseBoolean method will not work as expected with "1" or "0").
*/

public class Q1D {
    public static void main(String args[])
    {
        String strstatus1 ="1"; 
        String strstatus0 ="0";

        //method local variables 'strstatus' of type String
        
        boolean status1 = Boolean.parseBoolean(strstatus1);// false
        boolean status0 = Boolean.parseBoolean(strstatus0);//false

        //if you want to print result in 1 as true and 0 as false then u have to write
        
        //boolean status1 ="1".equals(strstatus1);
        //boolean status0 ="0".equals(strstatus0);


        // converting string into boolean

        System.out.println(status1);
        System.out.println(status0);
    
    }
    
}
