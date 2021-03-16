package com.rest;

import java.util.HashMap;

// Java program to count vowels in a string 
public class GFG { 
		
	// Function to check the Vowel 
	static boolean isVowel(char ch) 
	{ 
		ch = Character.toUpperCase(ch); 
		return (ch=='A' || ch=='E' || ch=='I' || 
						ch=='O' || ch=='U'); 
	} 
	
	// Returns count of vowels in str 
	static int countVowels(String str) 
	{ 
		HashMap<Character, Integer> hashMap = new HashMap<>();
		int count = 0; 
		for (int i = 0; i < str.length(); i++) 
		{
			if (isVowel(str.charAt(i))) 
			{
				char ch =Character.toLowerCase(str.charAt(i));
				if(hashMap.containsKey(ch))
				{
					hashMap.put(ch, hashMap.get(ch)+1);
				}
				else
				{
					hashMap.put(ch, 1);
				}
			}
		}
		
		System.out.println(hashMap.get('a'));
		
		System.out.println(hashMap);
		return count; 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		//string object 
		String str = "A tag question is a device used to turn a statement into a question. There are a few exceptions to this, frequently expressing an element of surprise or sarcasm: So you have made your first million, have you? Oh, that's your plan, is it? Be careful not to put a question mark at the end of an indirect question. Be careful to distinguish between an indirect question, and a question that is embedded within a statement which we do want to end with a question mark."; 
	
		// Total numbers of Vowel 
		System.out.println(countVowels(str)); 
	} 
} 
// This code is contributed by Sumit Ghosh 
