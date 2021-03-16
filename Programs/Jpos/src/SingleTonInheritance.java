
class Singleton {
	private static boolean initialized = false;

	public Singleton() {
		initialized = true;
	}

	{
		if (initialized)
			try {
				throw new Exception("Already one object exists");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

class b extends Singleton
{
	private static boolean initialized = false;

	public b() {
		super();
		initialized = true;
	}

	{
		if (initialized)
			try {
				throw new Exception("Already one object exists");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
}


public class SingleTonInheritance {

	public static void main(String[] args) throws Exception {
		Singleton a = new Singleton();
		System.out.println("A created");
		Singleton b = new Singleton();
		
		b b1 = new b();
		//b b2= new b();
	}

}