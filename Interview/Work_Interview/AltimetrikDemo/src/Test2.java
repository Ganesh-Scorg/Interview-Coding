import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * -----------------------------------
--------------------------
	A string s comprised of digits from 0 to 9 contains a perfect substring if all the elements within a substring occur exactly k times. 
	Calculate the number of perfect substrings in s.

	Example
	s = 1102021222
	k = 2
	The 6 perfect substrings are:
	s[0:1] = 11
	s[0:5] = 110202
	s[1:6] = 102021
	s[2:5] = 0202
	s[7:8] = 22
	s[8:9] = 22
 *
 */
public class Test2
{
	HashMap<Integer, Integer> digitcount = new HashMap<>();
	List<String>  substrings = new ArrayList<>();
	
	List<String> getPerfectSubstring(String str, int k)
	{
		for(int i=0;i<str.length();i++)
		{
			digitcount.clear();
			
			for(int j=i;j<str.length();j++)
			{
				char c = str.charAt(j);
				
				if(putInMap(c,k))
				{
					substrings.add(str.substring(i,j+1));
					System.out.println(" "+str.substring(0,j+1));
					
				}
				
				if(digitcount.containsKey(c) && digitcount.get(c)>k)
					break;
			}
		}
		return substrings;
	}
	
	
	
	boolean putInMap(int key, int k)
	{
		if(digitcount.containsKey(key))
		{
			digitcount.put(key, digitcount.get(key)+1);
			
			if(digitcount.get(key) == k)
			{
				if(isAllCharCountK(k))
				return true;
				else
					return false;
			}
			
		}
		else
		{
			digitcount.put(key, 1);
		}
		
		return false;
	}
	
	
	private boolean isAllCharCountK(int k)
	{
		for(Integer d : digitcount.keySet())
		{
			if(digitcount.get(d) != k)
			{
				return false;
			}
		}
		return true;
	}



	public static void main(String[] args)
	{
		String s = "1102021222";
		String s2 = "1020334040";
		
		int k =2;
		Test2 t = new Test2();
		System.out.println(t.getPerfectSubstring(s2, k));
		
		
	}
	
}

