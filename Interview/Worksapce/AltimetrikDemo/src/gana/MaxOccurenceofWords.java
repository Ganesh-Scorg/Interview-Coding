/*
 Copyright (c) 2021 by ACI Worldwide, Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package org.gana;

import java.util.HashMap;
import java.util.List;

/**
 * Find most frequently occurred word(s) in the following statement,
"Xyz is employee of ABC company, XYZ is from blore, XYZ! is good in java."
*/




public class MaxOccurenceofWords
{
	
	public List<String> findMaxOccurringWords(String sentence) 
	{
		HashMap<String,Integer> strhash = new HashMap<>();
		
		String [] strarray = sentence.split(" ");
		
		for(int i=0;i<strarray.length;i++)
		{
			String s = strarray[i].toUpperCase();
			//strarray[i].to
			
			if(strhash.containsKey(s))
			{
				strhash.put(s, strhash.get(s)+1);
			}else
			{
				strhash.put(s, 1);
			}
		}
		
		int maxcount=0;
		
		for(String s : strhash.keySet())
		{
			if(strhash.get(s)>maxcount)
			{
				maxcount = strhash.get(s);
			}
		}
		
		return null;

	}
	
	public static void main(String[] args)
	{
		
	}
	
}

