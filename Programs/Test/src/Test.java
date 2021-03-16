
/**
 * 
 * @author patilde
 *
 */
public class Test extends ksufks
{
	static int n = 0;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int k = 1000000;
		int a[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		n = k;
		slidingWindowMaximum(a, 0);
	}

	private static void slidingWindowMaximum(int[] a, int i) 
	{
		int k = i + 3;
		System.out.println("i" +i);		
		
		if (a.length < k) 
		{
			return;
		}

		// Find Max Value in Sub Arrays
		int max = 0;
		for (; i < k; i++) 
		{
			// Find Max Value
			max = findmax(max, a[i]);
		}

		System.out.println(max);
		// Print Max Sub Arrays Element

		// Find in next Sub Arrays in Max Call function
		slidingWindowMaximum(a, i - n + 1);
	}

	public static int findmax(int a, int b) {
		if (a < b) {
			return b;
		} else {
			return a;
		}
	}

}
