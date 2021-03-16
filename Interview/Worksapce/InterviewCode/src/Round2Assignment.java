import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Round2Assignment
{
	
	
	static Collection<Integer> findUnique(final Collection<Integer> data)
	{
     
		HashSet<Integer> hashset = new HashSet<>(data);
	
		return hashset;
   }
 
//Sample input: [1, 2, 4, 1, 45, 3, 2]
//Sample output: [1, 2, 4, 45, 3]
	
	public static void main(String[] args)
	{
		List<Integer> listofint = new ArrayList<>(Arrays.asList(1, 2, 4, 1, 45, 3, 2));
		
		HashSet<Integer> uniqueintarray = (HashSet<Integer>)findUnique(listofint);
		
		System.out.println("Initial Array = "+listofint);
		System.out.println("Unique Array = "+uniqueintarray);
	}
	
	//Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.
	//[1 2 3 4 5 6 7 8 9 10]
	
}

