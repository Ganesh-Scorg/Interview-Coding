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
import java.util.TreeMap;



/***
 * Find most frequently occurred word(s) in the following statement,
"XYZ is employee of ABC company, Xyz is from blore, XYZ! is good in java."


public List<String> findMaxOccurringWords(String sentence) {

}

 * TODO
 *
 */
public class LRUHashMap
{
	HashMap<Integer,String> hashmap ;
	HashMap<Integer,Integer> lrumap;
	int maxsize;
	int usecounter;
	
	LRUHashMap(int maxsize)
	{
		this.maxsize = maxsize;
		hashmap = new HashMap<>();
		lrumap = new HashMap<>();
	}
	
	
	String get(Integer key)
	{
		lrumap.put(key,usecounter++);
		return hashmap.get(key);
	}
	
	void put(Integer key, String value)
	{
		int leastcount = 0;
		if(hashmap.size()<maxsize)
		{
			hashmap.put(key, value);
			lrumap.put(key, usecounter++);
		}
		else
		{
			leastcount = getLeastCounter();
			hashmap.remove(leastcount);
			lrumap.put(leastcount, usecounter++);
			hashmap.put(key, value);
		}
	}
	
	private int getLeastCounter()
	{
		int least = 0;
		
		for(Integer i : lrumap.keySet())
		{
			if(lrumap.get(i)<least)
			{
				least = i;
			}
		}
		
		return least;
	}


	public static void main(String[] args)
	{
		//data structure of N capacity with LRU(Least recently used) mechanism
		//size fix
		//
		LRUHashMap map = new LRUHashMap(10);
		
		ex: datastructure of size 2
		.put(1, A); // {1=A}
		.put(2, B); // {1=A, 2=B}
		.get(1);    // return A
		.put(3, C); // LRU key was 2, key 2 is removed,{1=A, 3=C}
		.get(2);    // if not found,returns null 
		.put(4, D)  // LRU key was 1, key 1 is removed , {4=D, 3=C}
		.get(3);    // return C

		
	}
	
}

