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

public class StringOperation
{
	
	public static void main(String[] args)
	{
		String inputstring1 = "GaneshShinde";		
		String stringreverse1 = "";
		// 1: Reverse string using charAt()
		for (int i = inputstring1.length() - 1; i >= 0; i--)
		{
			stringreverse1 += inputstring1.charAt(i);
		}
		
		System.out.println("Reverse String 1 = " + stringreverse1);
		
		// 2: Reverse string using substring()
		stringreverse1 = "";
		
		for (int i = inputstring1.length(); i > 0; i--)
		{
			stringreverse1 += inputstring1.substring(i - 1, i);
		}
		
		System.out.println("Reverse String 2 = " + stringreverse1);

		//3: String Reverse using StringBuidler
		StringBuilder builderstring1 = new StringBuilder("GaneshShinde");
		
		StringBuilder str1 = builderstring1.reverse();
		str1.append(" changed reference");
		System.out.println("String Builder 1 "+builderstring1);
		
		//String Builder capacity
		StringBuilder builderstring2 = new StringBuilder("GaneshShinde"); //16+12 = 28
		
		System.out.println("String Builder 2 "+builderstring2+" capacity "+builderstring2.capacity()); //28
		
		builderstring2.append("12345678901234567"); //doubles when capacity is full
		
		System.out.println("String Builder 2 "+builderstring2.length()+" capacity "+builderstring2.capacity()); //28
		
		//4: String reverse for char sequence using own length
		char [] charStr = {'G','a', 'n','e','s','h','S','h','i','n','d','e'};
		
		char c;
		
		int charstrlength=0;
		
	   try
	   {
	   	for ( charstrlength= 0;;charstrlength++)
	   	{
	   		c = charStr[charstrlength];
	   	}
	   	
	   }catch (ArrayIndexOutOfBoundsException e)
	   {
	   	
	   }
		
	   System.out.println("charStr Length = "+charstrlength);
	
		
		for(int i=1;i<=charStr.length/2;i++)
		{
			 
			c=charStr[i-1];
			charStr[i-1] = charStr[charStr.length-i];
			charStr[charStr.length-i] = c;
		}
		
		System.out.println("Reverse Char array = "+String.valueOf(charStr));

			
		//5 Lenght without using API
		inputstring1 = "GaneshShinde";		
		
		char [] chararray = inputstring1.toCharArray();
		System.out.println("String = "+inputstring1+" : Length = "+chararray.length);
		
		String tempstr = inputstring1.concat("G");
		System.out.println("String = "+inputstring1+" : Length = "+tempstr.lastIndexOf("G"));
		
		//6 Split without using API
		char splitchar1 = ';';
		String splitchar2 = "shinde";
		String inputstring2 = "Ganesh;Shinde;Snehl;Shinde;Radha;Shinde;Narayan;Shinde";
		
		chararray = inputstring2.toCharArray();
		
		char [] chartemp;
		
		for (int i=0;i<chararray.length;i++)
		{
			
		}
		
		
		
	}
	
}
