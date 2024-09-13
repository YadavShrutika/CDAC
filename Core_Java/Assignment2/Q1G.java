//g. Experiment with converting a boolean value into other primitive types or vice versa and observe the results
public class Q1G {
    public static void main(String... args)
    {   

        //converting boolean to int
        boolean status =true;

        //use ternary operator to convert status to an int
        int value =status ? 1 :0;


        System.out.println(value);

        int value1 = 1;
        boolean boolValue = (value1 != 0); // Non-zero -> true, 0 -> false
        System.out.println("Int to boolean: " + boolValue);


    }
    
}
