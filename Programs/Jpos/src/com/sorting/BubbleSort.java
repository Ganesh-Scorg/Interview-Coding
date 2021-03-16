package com.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		
		Thread t= new Thread();
		
		int[] a = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23 };
		//int[] a = {7 ,9 ,10, 12, 23, 23, 34, 44, 78, 101};
		int swipecount = 0, loopcount = 0;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0 ; j<10-i-1 ; j++) {
				loopcount++;

				if (a[j] > a[j+1]) {
					swipecount++;
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < 10; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println("-->Complexity: ");
		System.out.println("swipecount="+swipecount+", loopcount="+loopcount);
	}
}
//Printing Sorted List ...
//7 9 10 12 23 23 34 44 78 101-->Complexity: 
//swipecount=18, loopcount=100
