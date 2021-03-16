package cm.junit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.adyen.Employee;

@RunWith(MockitoJUnitRunner.class)
public class Testemployee {	
	
	@Mock
	Employee employee;
	
	@Before
	public void setUp()
	{
		Mockito.when(employee.getName()).thenReturn("Deepak");		
	}
	
	@Test(expected=NumberFormatException.class)
	public void testSetname()
	{
		Employee employee = new Employee();
		employee.setName("Deepak");
		//String name ="Deepak";
		//Assert.assertEquals(employee.getName(), name);	
	}
	
	@Test
	public void testNotNull()
	{
		Employee employee = new Employee();
		Assert.assertNotNull(employee);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testSetnameMock()
	{
		Employee employee = new Employee();
		employee.setName("Deepak");
		String name ="Deepak";
		Assert.assertEquals(employee.getName(), name);	
	}

}
