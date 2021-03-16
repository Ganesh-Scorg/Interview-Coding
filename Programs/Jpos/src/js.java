
public class js {
	
	public void show()
	{
		System.out.println("a");
		
	}
	
	public static void main(String[] args) {
		js j = new a();
		
		j.show();
		((a)j).showme();
		
	}
	
	
}
class a extends js
{
	
	 public void show()
	{
		System.out.println("a1");
		
	}
	public void showme()
	{
		System.out.println("b");
		
	}
}
