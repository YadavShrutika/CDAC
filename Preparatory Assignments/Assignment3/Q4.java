//Write a program to reverse the digits of the number 1234. The output should be 4321. 

public class Q4
 {
    public static void main(String[] args) 
	{
        int num = 1234; 
        int reversed = 0; 
        while (num != 0) 
		{
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }

        System.out.println("Reversed Number: " + reversed); 
    }
}


/*D:\PreparatoryAssignments\Assignment3>java Q4
Reversed Number: 4321  */