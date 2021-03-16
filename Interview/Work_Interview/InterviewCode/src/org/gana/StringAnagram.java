package org.gana;

import java.util.HashMap;

public class StringAnagram {

	static boolean isAnagram(String str1, String str2)
	{
		
		HashMap<Character,Integer> charcount = new HashMap<>();
		
		for(int i=0;i<str1.length();i++)
		{
			Character ch = str1.charAt(i);
			if(charcount.containsKey(ch))
			{
				charcount.put(ch, charcount.get(ch)+1);
			}
			else
			{
				charcount.put(ch, 1);
			}
		}
		
		for(int i=0;i<str2.length();i++)
		{
			Character ch = str2.charAt(i);
			if(charcount.containsKey(ch))
			{
				if(charcount.get(ch)==1)
				{
					charcount.remove(ch);
				}
				else
				{
					charcount.put(ch, charcount.get(ch)-1);
				}
			}
		}
		
		if(charcount.isEmpty())
		{
			return true;
		}
		
		return false;
		
	}

	static void getCombination(String str, String space)
	{
		if(str.length()==0)
		{
			System.out.println(" "+space);
			return;
		}
		
		for(int i =0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			String st = str.substring(0, i) + str.substring(i+1);
			getCombination(st, space+ch);
		}
		
	}
	
	public static void main(String[] args) {

//		String str1 = "abcde";
//		String str2 = "acdeb";
//
//		if (isAnagram(str1, str2)) {
//			System.out.println("Anagram");
//		} else {
//			System.out.println("Not Anagram");
//		}
//		
		//=================== String Permutation =========
		String strcomb = "123"; 
		getCombination(strcomb," ");
		
		
	

	}

}
