import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Treemap {
	
	public static void main(String[] args) {
		TreeMap<Employee, Integer> tm = new TreeMap<>();
		
		TreeMap<Integer, Integer> tmK = new TreeMap<>();
		tmK.put(1, 1);
		TreeSet<Employee> ts = new TreeSet<>();
		
		try {
			throw new FileNotFoundException();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Employee e1= new Employee(10);
		Employee e2= new Employee(20);
		Employee e3 = new Employee(10);
		Employee e4 = new Employee(100);
		
		tm.put(e1, 10);
		tm.put(e2, 20);
		tm.put(e3, 10);
		tm.put(e4, 100);
		
		System.out.println(tm.size());		
		
		for(Entry<Employee, Integer> e: tm.entrySet())
		{
			System.out.println(e.getValue());
		}
		
		HashMap<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>();
	}

}
