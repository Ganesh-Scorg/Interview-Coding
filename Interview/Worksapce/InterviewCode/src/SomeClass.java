import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

interface SomeInterface
{
	public void foo(int a,int b);
}

class SomeClass implements SomeInterface {

	public static void main (String args[]){
           SomeClass someClass = new SomeClass();
           someClass.foo(10,15);   //25
		    someClass.foo((short)10,(short)15); //150
			 someClass.foo((byte)10,(byte)15);   //-5
			 
			 List<Object> listAl=new ArrayList<> ();
			 List<Object> listV=new Vector<> ();
			 Queue<Integer> queue = new LinkedList<>();
			 
			 
			 //===
			 Collection<Integer> col = new ArrayList<>();
			 col.add(1);
			 col.add(2);
			 col.add(3);

			 Queue<Integer> dq = new ArrayDeque<Integer>();
			 dq.add(1);
			 dq.add(2);

			 //col.addAll(dq);

			 if (col.containsAll(dq)) {
			     System.out.println("Valid" + col);
			 } else {
			     System.out.println("Not Valid" + dq);
			 }

	}
	
	
//	void foo(short a,short b){
//	    System.out.println(a*b);
//	}
	public void foo(int a,int b){
	    System.out.println(a+b);
	}
	void foo(byte a,byte b){
	    System.out.println(a-b);
	}
}