class Q6
{
public static void main(String args[])
{
int num=93;
boolean isprime=true;

for(int i=2;i<=num;i++)
{
if(num%i==0)
{
isprime=false;
break;
}
}
if(isprime)
{
System.out.println(num+"is prime number");
}
else
{
System.out.println(num+"is not prime number");
}
}
}


/*D:\PreparatoryAssignments\Assignment3>java Q6
93is not prime number*/
