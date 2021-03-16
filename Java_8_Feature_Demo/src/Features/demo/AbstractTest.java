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

 abstract class BaseClass
{
	
	void method1()
	{
		System.out.println("Inside Method 1");
	}

	abstract void method2();

}

 class ChildClass extends BaseClass
 {

	@Override
	void method2()
	{
		System.out.println("Inside Method 2");
		
	}
	 
 }
 
 
public class AbstractTest
{
	
	public static void main(String[] args)
	{
		BaseClass b1 = new ChildClass();
		
		b1.method1();
		b1.method2();
		
		
	}
	
}

