public class Test 
{ 
	Test i; 
	 volatile  int sharedVar = 6;
	 volatile int arr[] = new int[10];
	
	public static void main(String[] args) 
	{ 
		Test t1 = new Test(); 
		Test t2 = new Test(); 
		
		
		// Object of t1 gets a copy of t2 
		t1.i = t2; 
	
		// Object of t2 gets a copy of t1 
		t2.i = t1; 
		
		// Till now no object eligible 
		// for garbage collection 
		t1 = null; 
		
		//now two objects are eligible for 
		// garbage collection 
		t2 = null; 
		
		// calling garbage collector TE
		System.gc(); 
		
	} 

	@Override
	protected void finalize() throws Throwable 
	{ 
		System.out.println("Finalize method called"); 
	} 
} 
