package com.adyen;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Employee {

	public Employee() {
		super();
	}


	public Employee(int i, String name) {
		super();
		this.id = i;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name)throws NumberFormatException {
		Integer.parseInt(name);	
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	int id;
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	public static void main(String[] args) {
		
		//HashMap<Employee, String> map = new HashMap<>();
		
		
		TreeMap<String, String> map = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return arg1.compareTo(arg0);
			}
			
		});
		
		//Employee employee = new Employee(1,"deepak");
		//Employee employee2 = new Employee(2, "dddd");
		//Employee employee3 = new Employee(1, "yoo");
		
		map.put("abc", "abc");
		map.put("abz", "123");
	
		for(Entry<String, String> e:map.entrySet())
		{
			System.out.println(e.getKey());
		}
		
		
		
		
	}

}
