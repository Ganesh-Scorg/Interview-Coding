package com.collectionstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListProcessing {

	public static void main(String[] args) {

		//No common and no repeat -> 1,3,6 should be answer
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,5, 5,6));
		
		System.out.println("List 1 "+list1);
		System.out.println("List 2 "+list2);
		
		List<Integer> listunion = new ArrayList<>(list1);
		listunion.addAll(list2);
		
		System.out.println("List 1 + List 2 "+listunion);
		
		List<Integer> listcommon = new ArrayList<>(list1);
		listcommon.retainAll(list2);
		
		System.out.println("List 1 common List 2 "+listcommon);
		
		listunion.removeAll(listcommon);
		
		System.out.println("No common all "+listunion);
		
		HashSet<Integer> ht = new HashSet<>();
		
		//listunion.removeIf(l -> !ht.add(l) );
		CopyOnWriteArrayList<Integer> copylist = new CopyOnWriteArrayList<>(listunion);
		Iterator<Integer> itr = copylist.iterator();
		
		while(itr.hasNext())
		{
			int value = itr.next();
			if(ht.add(value)==false)
			{
				copylist.removeAll(Arrays.asList(value));
			}
		}
		
		System.out.println("Expected result "+copylist);
		
		
	}

}
