package Features.demo;


interface InterfaceA {
	
	default void method(int A)
	{
		System.out.println("Interface A");
		
	}

}

interface InterfaceB {
	
	default void method(int B)
	{
		System.out.println("Interface B");
		
	}
}

class InterfacetestMethod implements InterfaceA, InterfaceB {

	@Override
	public void method(int A) 
	{
		System.out.println("C..");
		InterfaceA.super.method(A);
		InterfaceB.super.method(A);
	}
}


public class DefaultInterfaceDemo 
{
	public static void main(String[] args) 
	{
		
		InterfacetestMethod a = new InterfacetestMethod();
		a.method(1);
		
//		InterfaceA obj = (int A) -> System.out.println("Interface A"); // won't work as this is not an functional interface
	}	
}