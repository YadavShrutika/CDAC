//1. Write a program to calculate the sum of the first 50 natural numbers. 


public class Q1
{  
public static void main(String[] args)   
{  
int i, num = 50, sum = 0;  

for(i = 1; i <= num; i++)  
{  
 
sum = sum + i;  
}    
System.out.println("Sum of First 50 Natural Numbers is = " + sum);  
}  
}  

/*D:\PreparatoryAssignments\Assignment3>java SumOfNaturalNumber
Sum of First 50 Natural Numbers is = 1275
*/