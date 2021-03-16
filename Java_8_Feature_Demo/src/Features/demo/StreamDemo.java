package Features.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo 
{
	public static void main(String[] args) 
	{
		List <Integer> intList = new ArrayList<>();
		
		for(int i=1; i<=100;i++)
		{
			intList.add(i);
		}
		
	//intList.parallelStream().forEach(i -> System.out.println(i));
		
	//intList.stream().forEach(i -> System.out.println(i));
		
	/*	intList.stream().filter(i -> 
							{
								if(i > 50)
									return true;
								return false;
							}).forEach(i -> System.out.println(i));
		
		intList.stream().filter(i -> i > 50).forEach(i -> System.out.println(i));
	*/	
		System.out.println(intList.parallelStream().filter(i -> 
		{
			if(i > 50)
				return true;
			return false;
		}).findFirst());
	}
}
