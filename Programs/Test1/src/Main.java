import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//w  ww.ja  va 2  s.  c o  m
class Employee {
	private String name;
	private String address;
	private String phone;

	public Employee() {
		super();
	}

	public Employee(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}

public class Main {

	public static void main(String[] args) {

		Set<Employee> empSet = new HashSet<Employee>(populateList());

		for (Employee employee : empSet) {
			System.out.println(employee);
		}

	}

	public static List<Employee> populateList() {
		List<Employee> lsts = new ArrayList<Employee>();

		lsts.add(new Employee("A", "B", "123456"));
		lsts.add(new Employee("C", "E", "123685"));
		lsts.add(new Employee("D", "F", "1257456"));
		lsts.add(new Employee("D", "F", "196356"));
		lsts.add(new Employee("A", "B", "123456"));
		lsts.add(new Employee("A", "B", "123456"));
		lsts.add(new Employee("A", "B", "123456"));
		return lsts;

	}

}