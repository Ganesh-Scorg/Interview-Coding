package com.basic;

class A
{
	private static int instancecount;
	
	A() throws Exception
	{
		System.out.println("Inside A's default constructor");
		if(instancecount>0)
		{
			throw new Exception("Can't instantiate object twice");
		}
		instancecount++;
		
	}
	
	A(int dummy)
	{
		System.out.println("Inside A's parameterized constructor");
	}
	
	public static void myfun()
	{
		System.out.println("Inside A's myfun");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside A's main");
	}
}

class B extends A
{
	private static int instancecount;
	
	B() throws Exception {
		super(1);
		System.out.println("Inside B's default constructor");
		if(instancecount>0)
		{
			throw new Exception("Can't instantiate object twice");
		}
		instancecount++;
	}
	
	public static void myfun()
	{
		System.out.println("Inside B's myfun");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside B's main");
	}
	
}
public class SingleInstanceClass {

	public static void main(String[] args) {
		
		try {
			A a = new A();
			B b = new B();
			//B b2 = new B();
			
			a.myfun();
			b.myfun();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			try {
				//A a2 = new A();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
