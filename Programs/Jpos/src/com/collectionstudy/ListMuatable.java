package com.collectionstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListMuatable {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Ganesh", "Narayan", "Shinde", "Shinde"));
		List<String> listsurname = new ArrayList<>(Arrays.asList("Shinde"));
		Iterator ltr = list.iterator();
		
		while (ltr.hasNext())
		{
			String temp = (String) ltr.next();
			System.out.println(" "+temp);
//			if(temp.equals("Ganesh"))
//			ltr.remove();
		}
		
		String surname = "Shinde";
		//list.removeIf(x -> x.equals("Shinde"));
		//list.removeAll(listsurname);
		list.removeAll(Arrays.asList(surname));
		
		for (String l : list)
		{
			System.out.println(" "+l);
		}
	}

}
