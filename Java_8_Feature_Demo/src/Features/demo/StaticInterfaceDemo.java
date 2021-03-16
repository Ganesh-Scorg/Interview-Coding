package Features.demo;


interface InterfaceStatic {
	
	static void method()
	{
		System.out.println("Hello from Interface static");
	}
	
	public void anotherMethod();
}



public class StaticInterfaceDemo implements InterfaceStatic 
{
	public static void main(String[] args) 
	{
		InterfaceStatic is = new StaticInterfaceDemo();
		InterfaceStatic.method();
		
		is.anotherMethod();
	}

	@Override
	public void anotherMethod() 
	{
		System.out.println("Hello from anotherMethod");
	}
}


