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

public class MaxArray
{

	    public static int solution(int[] A) 
	    {
	        // write your code in Java SE 8
	   	 int max = 0;
	        for(int i=0;i<A.length;i++)
	        {
	      	  if(A[i]%3==0 && max<A[i])
	      	  {
	      		  max=A[i];
	      	  }
	        }
	        
	        return max;
	    }
		
	public static void main(String[] args)
	{
		
		int [] arr = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
		System.out.println("Max Value"+solution(arr));
	}
	
}

