package Features.demo;

import java.util.Arrays;
import java.util.List;

// Call By value
// Call by method

public class MethodReferenceDemo 
{
	public static void main(String[] args) 
	{
		List <String> list = Arrays.asList("Samveg", "Lunawat", "ACI", "Worldwide");
		
		//list.forEach(s -> System.out.println(s));
//		list.forEach(System.out::println);
		list.forEach(System.out::println);
	}
}
