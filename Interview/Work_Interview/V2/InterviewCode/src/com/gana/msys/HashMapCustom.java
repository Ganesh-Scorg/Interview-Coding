/*
 Copyright (c) 2021 by ACI Worldwide, Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package com.gana.msys;

import java.util.HashMap;

public class HashMapCustom
{
	public static String solution(String[] A) {
		
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		
		StringBuilder solutionoutout = new StringBuilder();
		
		for(int i=0;i<A.length;i++)
		{
			String[] tempStr = A[i].split(":");
			
			try
			{
				switch(tempStr[0])
				{
					case "i":  // put
						hashmap.put(Integer.parseInt(tempStr[1]), Integer.parseInt(tempStr[2]));
						break;
					case "j":  //get and print
						Integer keyint = Integer.parseInt(tempStr[1]);
						if(hashmap.containsKey(keyint))
						{
							solutionoutout.append(hashmap.get(keyint)).append(" ");
						}
						else
						{
							solutionoutout.append("-1").append(" ");
						}
						break;
					case "k":   //size
						solutionoutout.append(hashmap.size()).append(" ");
						break;
					case "l":   //remove
						hashmap.remove(Integer.parseInt(tempStr[1]));
						break;
						
						default: 
							return "Something went wrong";
				}
			}
			catch(Exception e)
			{
				System.out.println("Input String is not as per the query format"+e);
			}
			
		}
		
		return solutionoutout.toString();
  }
	
	public static void main(String[] args)
	{
		String[] query = {"i:1:2", "i:66:3", "j:66", "l:1", "k"};
		System.out.println("Final Result = ["+solution(query)+"]");
	}
	
}

