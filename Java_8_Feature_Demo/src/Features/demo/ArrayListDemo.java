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

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo
{
	int num = 10;
	
	public static void main(String[] args)
	{
		
		HashSet st = new HashSet();
		
//		ArrayList l = new ArrayList();
//		
//		l.add(10);
//		l.add("20");
//		
//		String str = (String)l.get(0);
//		String str2 = (String)l.get(1);
//		
//		System.out.println("String 1"+str+" , String2 "+str2);
		//ArrayListDemo d = new ArrayListDemo();
		
		ArrayList<Employee> listofEmp = new ArrayList();
		
		String fileRecord ="";
		String name= "";
		String addr= "";
//		for()
//		{
//			fileRecord = f.readLine();
//			
//			//TODO
//			
//			listofEmp.add(new Employee(name,addr));
//		}
		Employee e1 = new Employee("Snehal", "Rethare");
		Employee e2 = new Employee("Ganesh", "Madha");
		
		listofEmp.add(e1);
		
		listofEmp.add(e2);
	}
	
}

class Employee
{
	String name;
	String address;
	
	public Employee()
	{
		
	}

	public Employee(String name, String addr)
	{
		this.name = name;
		address = addr;
		
	}


}

