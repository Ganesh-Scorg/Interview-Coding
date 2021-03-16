/*
 Copyright (c) 2020 by ACI Worldwide, Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package Features.demo;

public class Precendance
{
	
	public static void main(String[] args)
	{
		int i=0;
		int j=1;
		
		int k=0 ;//= i++ + ++j;		
		
		System.out.println("I="+i+" J="+j+" K="+k);
		
		//int l = i++ + j-- + ++j;
		int l = ++i + j*10 + --j;//+ ++j;
		
		System.out.println("I="+i+" J="+j+" K="+k+" L="+l);
	}
	
}

