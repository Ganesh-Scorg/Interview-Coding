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

public class CountryMap
{
	public static int solution(int[][] A) 
	{
		int countrycount =1;
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
					int presence = 0;
					
					if(i-1>=0 && A[i-1][j] == A[i][j])
					{
						//skip if Already counted
						presence++;
					}
					
					if(j-1>=0 && A[i][j-1] == A[i][j])
					{
						//skip if Already counted
						presence++;
					} 
					
					if(presence ==2)
					{
						countrycount--;
					}
					else if(presence ==1)
					{
						//no count
					}
					else
					{
						countrycount++;
					}
			}
		}
		
		return countrycount;
  }
	
	public static void main(String[] args)
	{
		int [][] mapint = {{5,4,4}, {4,3,4}, {3,2,4}, {2,2,2}, {3,3,4}, {1,4,4}, {4,1,1}};
		
		System.out.println("Nunber of valid country = "+solution(mapint));
		
	}
	
}

