package Features.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		List <Integer> values  = Arrays.asList(4,5,6,7,8);
		
		// First way --> Common approach
		// External Iteration
		/*for(int i=0;i<values.size();i++)
		{
			System.out.print(values.get(i));
		}
		
		// Using For each loop
		// External Iteration
		for(int i : values)
		{
			System.out.print(i);
		}*/
		
		// Java 8 forEach method
		// Internal iteration
//		values.forEach(i -> System.out.print(i)); // Lambda // Consumer
		
		Consumer<Integer> cons = new ConsImpl();
		values.forEach(cons); // Lambda // Consumer
		
		/*Consumer<Integer> it = new Consumer<Integer>() 
								{
									@Override
									public void accept(Integer t) 
									{
										System.out.println(t);
									}
								};
								
		values.forEach(it); // Lambda // Consumer
		*/
		//values.forEach(i -> System.out.println(i));
	}
}

class ConsImpl implements Consumer<Integer>
{
	@Override
	public void accept(Integer t) 
	{
		System.out.println(t);
	}
	
}
