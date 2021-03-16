
public class JavaBasic {

	static int num;
	String name="Ganesh";
	
	{
		System.out.println("Inside normal plain block");
		//num = 1;
	}
	
	static
	{
		System.out.println("Inside normal static block");
		num = 2;
	}
	
	JavaBasic()
	{
		this(1,2);
		System.out.println("Inside constructor");
		num+=5;
		
	}
	
	JavaBasic(int a, int b)
	{
		System.out.println("1 2 constructor");
	}
	
	void changestaticnum()
	{

		num = 0;
		name="SHinde";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		int i;
		JavaBasic j = new JavaBasic();
		JavaBasic j2 = new JavaBasic();
		System.out.println("num is = "+JavaBasic.num);

		j2.changestaticnum();
		System.out.println("num is = "+JavaBasic.num);
		System.out.println("Name = "+j2.name);
	}

}
