//sum of the digits of the number 


import java.util.Scanner;

class Q7
{
public static void main(String[] args)
{

int number;
int digit;
int sum=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
number=sc.nextInt();

while(number>0)
{
  digit=number%10;
  sum=sum+digit;
  number=number/10;
  
  }
  
  System.out.println("Sum of the digit : "+sum);
  }
}


/*    D:\PreparatoryAssignments\Assignment3>java Q7
Enter the number :
9876
Sum of the digit : 30
*/