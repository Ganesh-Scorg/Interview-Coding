
public class Employee implements Comparable<Employee> {
	
	int id;
	
	public Employee(int id) throws Error {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) throws NullPointerException {
		
		this.id = id;
	}
	@Override
	public int compareTo(Employee arg0) {
		
		return this.id - arg0.getId();
	}
	

}
