import java.util.HashMap;

public class StringAnagramCheck
{
	
	public static void main(String[] args)
	{
		HashMap<Character,Integer> charstore = new HashMap<>();
		
		String str1 = "abcccdx";
		String str2 = "cccdab";

		for(int i=0;i<str1.length();i++)
		{
			Character ch = str1.charAt(i);
			
			if(charstore.containsKey(ch))
			{
				charstore.put(ch,charstore.get(ch)+1);
			}
			else
			{
				charstore.put(ch,1);
			}
		}
		
		for(int i=0;i<str2.length();i++)
		{
			Character ch = str2.charAt(i);
			
			if(charstore.containsKey(ch))
			{
				if(charstore.get(ch)==1)
				{
					charstore.remove(ch);
				}
				else
				{
					charstore.put(ch,charstore.get(ch)-1);
				}
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		
		if(charstore.isEmpty())
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		
	}
	
}

