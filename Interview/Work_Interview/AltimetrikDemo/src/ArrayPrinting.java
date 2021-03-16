class Array 
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public int[] getArr() 
	{
		return arr;
	}

}

class ArrayTask implements Runnable 
{
	boolean isEven;
	Array a;

	ArrayTask(boolean isEven, Array arr) {
		this.isEven = isEven;
		a = arr;
	}

	public void run() {

			if (isEven) 
			{
				for (int i : a.getArr()) 
				{
					if (i % 2 == 0) {
						System.out.println("Even Thread :"+i+" Name = "+Thread.currentThread().getName());
					}
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} 
			else 
			{
				for (int i : a.getArr()) {
					if (i % 2 != 0) {
						System.out.println("Odd Thread :"+i+" Name = "+Thread.currentThread().getName());
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	
}

public class ArrayPrinting {

	public static void main(String[] args) 
	{

		Array a = new Array();

		Thread eventread = new Thread(new ArrayTask(true, a));
		Thread oddtread = new Thread(new ArrayTask(false, a));

		eventread.start();
		oddtread.start();
	}

}
