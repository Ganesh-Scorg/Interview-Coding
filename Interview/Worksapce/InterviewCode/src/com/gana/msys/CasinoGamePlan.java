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

public class CasinoGamePlan
{
	 public static int solution(int N, int K) 
	 {
		 int allIncount=0;
		 int singlestep = 0;
		 while(N>2 && K>allIncount)
		 {
			 if(N%2!=0)
			 {
				 singlestep++;
			 }
			 
			 N = N/2;
			 allIncount++;
		 }
		 
		 System.out.println("All in Count = "+allIncount);
		 System.out.println("Single Count = "+singlestep);
		 System.out.println("N = "+N);

		 return N+singlestep+allIncount-1;
   }
	 
	public static void main(String[] args)
	{
		System.out.println("Number of Game Round = "+solution(10,10));
	}
	
}

