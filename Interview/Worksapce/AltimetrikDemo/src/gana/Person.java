package org.gana;
class Person {
	private Person parent;

	public Person(Person parent) {
		this.parent  = parent;
	}


	public Person getParent() {
		return parent;
	}
}


public class PersonService 
{

	//Implement this method: Method should return the root parent. 
	//Root parent is the one who doesn’t have a parent and root for the family tree. 
	//Each Person mandatorily have parent except the root parent.
	public  Person getRootParent(Person p) 
	{
//	  while(p.getParent()!=null)
//	  {
//		  p = p.getParent();
//	  }
	  
		if(p.getParent()==null)
		{
			 return p;
		}
		
		getRootParent(p.getParent());
	 
	}
}
