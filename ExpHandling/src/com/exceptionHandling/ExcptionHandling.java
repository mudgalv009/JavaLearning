package com.exceptionHandling;

public class ExcptionHandling {

	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
int a,b,c;
a=10;
b=0;
try
{
c=a/b;
}
catch(ArithmeticException  ae)
{
	System.out.println(ae.getMessage());
	System.out.println("This is ArithmeticException");
}
catch(Exception e)
{
System.out.println(e.getMessage());
System.out.println("User defined message: Exception Handling");
}
System.out.println("Exception handled");
	}

}
