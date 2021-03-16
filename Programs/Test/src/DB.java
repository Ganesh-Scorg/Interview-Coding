import sun.security.jca.GetInstance.Instance;

public class DB {
	
	public void setname(String name)
	{
		System.out.println("a");
	}

	public void setname(Number name)
	{
		System.out.println("Number");
	}
	
	public void setname(Float name)
	{
		System.out.println("Float");
	}
	
	public void setname(Object name)
	{
		System.out.println("Object");
	}
	

	public static void main(String [] args) {
		
		Object obj = null;
		DB b = new DB();
		b.setname(obj);
		b.setname(4.0);
		Number n = 4.1;
		System.out.println(n instanceof Double);
	
		
	}





}
