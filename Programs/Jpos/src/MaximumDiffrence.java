// Java program to find Maximum difference 
// between two elements such that larger 
// element appears after the smaller number 
public class MaximumDiffrence 
{ 
	/* The function assumes that there are at least two 
	elements in array. 
	The function returns a negative value if the array is 
	sorted in decreasing order. 
	Returns 0 if elements are equal */
	public int maxDiff(int arr[], int size) 
	{ 
		int max_difference = arr[1] - arr[0]; 
		int min = arr[0]; 
		int i; 
		for (i = 1; i < size; i++) 
		{ 
			if (arr[i] - min > max_difference) 
				max_difference = arr[i] - min; 
			if (arr[i] < min) 
				min = arr[i]; 
		} 
		return max_difference; 
	} 

	/* Driver program to test above functions */
	public static void main(String[] args) 
	{ 
		MaximumDiffrence maxdif = new MaximumDiffrence(); 
		int arr[] = {10, 2, 90, 110, 1}; 
		int size = arr.length; 
		System.out.println("MaximumDifference is " + 
								maxdif.maxDiff(arr, size)); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 
