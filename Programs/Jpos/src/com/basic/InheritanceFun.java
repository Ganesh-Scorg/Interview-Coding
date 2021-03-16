package com.basic;

class X
{
	static int i=10;
}

class Y extends X
{
	static int i=20;
}

public class InheritanceFun {

	public static void main(String[] args) {
	X y = new Y();
	
	System.out.println("i="+y.i);
	}

}
