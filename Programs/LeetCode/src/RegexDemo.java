/*
 Copyright (c) 2020 by ACI Worldwide, Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

public class RegexDemo
{
	
	public static void main(String[] args)
	{
		String EXAMPLE_TEST = "title Mr title is great                      .";
	// Removes whitespace between a word character and . or ,
		String pattern = "(\\w+)(\\s+)(.|,)";
		System.out.println(EXAMPLE_TEST);
		System.out.println(EXAMPLE_TEST.replaceAll(pattern, "$1$3"));
		
	// Extract the text between the two title elements
		pattern = "(?i)(<title.*?>)(.+?)()";
		String updated = EXAMPLE_TEST.replaceAll(pattern, "$2");
		System.out.println(updated);
	}
	
}

