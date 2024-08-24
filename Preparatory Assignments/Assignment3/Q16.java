/*

16. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
*********

*/

class Q16  
{    
public static void main(String args[])   
{    
int i, j, row = 6;         
for (i=0; i<row; i++)   
{       
for (j=row-i; j>1; j--)   
{  
System.out.print(" ");   
}   
for (j=0; j<=i; j++ )   
{   
 
System.out.print("* ");   
}    
System.out.println();   
}   
}   
}  

/*

D:\PreparatoryAssignments\Assignment3>java Q16
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/