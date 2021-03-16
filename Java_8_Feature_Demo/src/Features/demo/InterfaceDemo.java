package Features.demo;
// Java program to demonstrate scope 
// of static method in Interface. 

interface PrintDemo { 

	// Static Method 
	static void hello() 
	{ 
		System.out.println("Called from Interface PrintDemo"); 
	} 
	
	default void hi()
	{
		System.out.println("Called from Interface hi"); 
	}
} 

public class InterfaceDemo implements PrintDemo { 

	public static void main(String[] args) 
	{ 

		// Call Interface method as Interface 
		// name is preceeding with method 
		PrintDemo.hello(); 

		// Call Class static method 
		hello(); 
		
		PrintDemo demo = new InterfaceDemo();
		demo.hi();
		
		
	} 

	// Class Static method is defined 
	static void hello() 
	{ 
		System.out.println("Called from Class"); 
	} 
	
//	@Override
//	public void hi()
//	{
//		System.out.println("Called from InterfaceDemo hi"); 
//	}
} 
