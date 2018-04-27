package com.exceptionHandling;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hello";
String b="Hello";
String c=new String("Hello");
String d=new String("Hello");

if(a==b) // compares the address not value
{
	System.out.println("Address compares for a and b: a==b");
	
}else
{System.out.println("Values compare for a and b: a==b");
	}
if(a.equals(b)) //value compares not address
{
	System.out.println("Value compares for a and b: a.equals(b)");
}
else
{
System.out.println("Address compares for a and b: a.equals(b)");	
}

if(c==d)
{
System.out.println("Value compares for c and d: c==d");	
}
else
	System.out.println("Address compared for c and d: c==d");
	if(c.equals(d))
	{
		System.out.println("value compares with equals: c.equals(d)");
		
	}
	else
		System.out.println("Address compares with equals: c.equals(d)");
	}

}
