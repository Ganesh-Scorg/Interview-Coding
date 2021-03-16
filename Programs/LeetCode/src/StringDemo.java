import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 Copyright (c) 2020 by ACI Worldwide, Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

public class StringDemo
{
	public static void main(String [] args) throws IOException
	{
//		String str1= "Ganesh";
//		String str2 = "Ganesh";
//		String str3 = new String("Ganesh");
//		String str4 = new String("Ganesh");
//		
//		if(str1==str2)
//		{
//			System.out.println("Strings are equal 1");
//		}
//		
//		if(str1.equals(str2))
//		{
//			System.out.println("Strings are equal 2");
//		}
//		
//		if(str1==str3)
//		{
//			System.out.println("Strings are equal 3"); 
//		}else
//		{
//			System.out.println("Strings are not equal 3");
//		}
//		
//		if(str1.equals(str3))
//		{
//			System.out.println("Strings are equal 4");
//		}
//		
//		if(str4==str3)
//		{
//			System.out.println("Strings are equal 5");
//		}else
//		{
//			System.out.println("Strings are not equal 5");
//		}
//		
//		if(str4.equals(str3))
//		{
//			System.out.println("Strings are equal 6");
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   //int num = Integer.parseInt(br.readLine());
		
		String str = "Ganesh:Ganesh:Ganesh";
		System.out.println("Check "+str.charAt(0)+" Lenght "+str.length());
		System.out.println("abcdefghij".substring(3));
		
		System.out.println(str.subSequence(0, 6)); //Ganesh
		
		System.out.println(str.lastIndexOf("Ganesh")); //14 a start of last Ganesh
		System.out.println(str.startsWith("Ganesh", 7));
		
		String [] splitarray = str.split(":");
		System.out.println("-->"+splitarray.toString());
		
		String strRegex = "ACI";
		String strRegexSingle = "A";
		splitarray = strRegex.split("A");
		splitarray = strRegexSingle.split(".");
		
		//System.out.println(str.format(format, args));
//	Scanner s = new Scanner(new FileReader("c:\\zandu.txt"));
//	
//	//Scanner s = new Scanner(System.in);
//	System.out.println("File Contents:e");
//	
//	while(s.hasNext())
//	{
//		System.out.println(s.nextLine());
//	}
////	String str=""; // = s.nextLine();
////	System.out.println("You are Mr. "+str);
////	//str = s.nextLine();
////	System.out.println("Your Occupation is "+str);
	}
	
}

