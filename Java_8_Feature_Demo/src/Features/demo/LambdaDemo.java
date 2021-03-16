package Features.demo;

@FunctionalInterface  // not mandatory
interface A{
	void display(int a);
	
	default void disaply1()
	{
		System.out.println("Under default method from interface");
	}
}

class xyz implements A{

	@Override
	public void display(int b) 
	{
		System.out.println("Display something..in XYZ");
	}
	
}

public class LambdaDemo {
	
	public static void main(String[] args) 
	{
		A obj1 = new xyz();
		obj1.display(5);
		obj1.disaply1();
		
//		A obj = (a) -> {
//			System.out.println("Display something.."+a);
//		};
		
//		obj.display(4);
		
//		A obj = ()-> 
//		{
//			System.out.println("Display something..");
//		};
		
//		A obj = () -> System.out.println("Display something.."); // with no parameter
		
		A obj = (int i) -> System.out.println("Display something..as Lambda");
//		A obj = (i) -> System.out.println("Display something..");
//		A obj = i -> System.out.println("Display something.. + "+ i);
		
		obj.display(6);
		obj.disaply1();
	}
}


