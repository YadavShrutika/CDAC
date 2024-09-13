/* b. Declare a method-local variable status of type boolean with the value true and
 convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).*/

 class Q1B{
    public static void main(String args[])
    {
        boolean b = true;
        //declared method local variable 'b' as type boolean

        String b_as_String = Boolean.toString(b);
        //converting the value boolean into String using wrapper class
        System.out.println(b);
    }
 }