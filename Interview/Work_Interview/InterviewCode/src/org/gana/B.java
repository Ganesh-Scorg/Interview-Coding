package org.gana;

interface A
{
	void test();
}

class B implements A
{
	public void test()
	{
		System.out.println("Executor");
	}
	
	public static void main(String [] args)
	{
		A a = new B();
		
		a.test();
	}
}


