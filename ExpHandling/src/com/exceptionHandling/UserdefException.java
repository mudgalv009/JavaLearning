package com.exceptionHandling;

class UserException extends Exception
{
	@Override
	public String getMessage()
{
return "User defined message for exception";	
}
}
public class UserdefException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int accountbalance=9900;
try
{
if(accountbalance>10000)
{
	System.out.println("Value not match");
}else
{
	System.out.println("This is else part");
	throw new UserException();
	
}
}
catch (UserException me)
{
System.out.println(me.getMessage());	
}

	finally	{
		System.out.println("This requires to run");
	}
	}
}

