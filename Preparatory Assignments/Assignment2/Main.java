/*public class Main{
public void main(String args[])
{
System.out.println("hello");

}}    D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)
*/

/*public class Main{
	static void main(String args[])
	{
		System.out.println("Hello");
	}
}      D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application


public class Main{
	public static int main(String args[])
	{
		System.out.println("Hello");
		return 0;
	}
}        D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)



public class Main{
	public static void main()
	{
		System.out.println("hello");
	}
}    D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application


public class Main{
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
	
	public static void main(int[] args)
	{
		System.out.println("overloaded main method");
	}
}


public class Main{
	public static void main(String[] args)
	{
		int x=y+10;
		System.out.println(x);
		
	}
}       D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:70: error: cannot find symbol
                int x=y+10;
                      ^
  symbol:   variable y
  location: class Main
1 error


 public class Main{
	 public static void main(String args[])
	 {
		 int x="hello";
		 System.out.println(x);
	 }
 }          D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:86: error: incompatible types: String cannot be converted to int
                 int x="hello";
                       ^
1 error

public class Main{
	public static void main(String args[])
	{
		System.out.println("hello"
	}
}    D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:99: error: ')' expected
                System.out.println("hello"
                                          ^
1 error


public class Main{
	public static void main(String[] args)
	{
		int class=10;
		System.out.println(class);
	}
	} 

	D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:110: error: not a statement
                int class=10;
                ^
Main.java:110: error: ';' expected
                int class=10;
                   ^
Main.java:110: error: <identifier> expected
                int class=10;
                         ^
Main.java:111: error: illegal start of expression
                System.out.println(class);
                                   ^
Main.java:111: error: <identifier> expected
                System.out.println(class);
                                        ^
5 errors


public class main{
	public void display()
	{
		System.out.println("no parameter");
	}
	public void display(int num)
	{
		System.out.println("with parameter :"+num);
	}
	
	public static void main(String[] args)
	{
		display();
		display(6);
	}
}   

D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:134: error: class main is public, should be declared in a file named main.java
public class main{
       ^
Main.java:146: error: non-static method display() cannot be referenced from a static context
                display();
                ^
Main.java:147: error: non-static method display(int) cannot be referenced from a static context
                display(6);
                ^
3 errors



public class Main{
	public static void main(String[] args)
	{
		int[] arr={1,2,3};
		System.out.println(arr[5]);
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Main.java:169)
		
	
		
public class Main{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("infinite loop");
		}
	}
}     

it will print infinite times "infinite loop".




		public  class Main{
			public static void main(String[] args)
			{
				String str=null;
				System.out.println(str.length());
				
			}
		}
		
		
		D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Main.main(Main.java:200)
		

public class Main{
	public static void main(String args[])
	{
		double num="hello";
		System.out.println(num);
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:216: error: incompatible types: String cannot be converted to double
                double num="hello";
                           ^
1 error


public class Main{
	public static void main(String args[])
	{
		int num1=10;
		double num2=5.5;
		int result = num1 + num2;
		System.out.println(result);
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:233: error: incompatible types: possible lossy conversion from double to int
                int result = num1 + num2;
                                  ^
1 error



public class Main{
	public static void main(String[] args)
	{
		int num=10;
		double result=num/4;
		System.out.println(result);
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
2.0



public class Main{
	public static void main(String[] args)
	{
		int a=10;
		int b=6;
		int result=a**b;
		System.out.println(result);
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:267: error: illegal start of expression
                int result=a**b;
                             ^
1 error


public class Main{
	public static void main(String[] args)
	{
		int a=2;
		int b=5;
		int result=a+b*2;
		System.out.println(result);
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
12



public class Main{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int result=a/b;
		System.out.println(result);
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java

D:\PreparatoryAssignments\Assignment2>java Main
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:301)
		


public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World") 
    } 
} 

D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:316: error: ';' expected
        System.out.println("Hello, World")
                                          ^
1 error


public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
}

D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:331: error: reached end of file while parsing
}
 ^
1 error



public class Main{
	public static void main(String args[])
	{
		static void displayMessage(){
			System.out.println("Message");
		}
	}
}

D:\PreparatoryAssignments\Assignment2>javac Main.java
Main.java:344: error: illegal start of expression
                static void displayMessage(){
                ^
Main.java:348: error: class, interface, enum, or record expected
}
^
2 errors

*/

 
