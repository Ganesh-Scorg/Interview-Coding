import java.util.HashSet;

public class SinglyLL {
	
	static class Node
	{
		char value;
		Node next;
		
		Node(char value)
		{
			this.value = value;
			this.next = null;
		}
	}
	
	static Node head;

	static void removeDuplicate()
	{
		HashSet<Character> hashset = new HashSet<>();
		Node prev = head;
		for(Node itr = head; itr.next != null; itr=itr.next)
		{
			
			if(hashset.add(itr.value))
			{
				//System.out.println("Inserted in HashSet");
				prev = itr;
			}
			else
			{
				//remove the element from linked list
				prev.next = itr.next;
			}
		}
	}
	
	static Node getNodeFrom(Node head1, int k)
	{
		Node itr1 = head;
		//Node itr2 = head;
		//int counter = 0;
		
//		if(counter < k)
//		{
//			itr1 = itr1.next;
//		}
//		else
//		{
//			itr1 = itr1.next;
//			itr2 = itr2.next;
//		}
		
		if(head1.next== null || itr1.next ==null)
		{
			return itr1;
		}
		
		if(k>=0)
		{
			getNodeFrom(head1.next,k--);
		}else
		{
			getNodeFrom(itr1.next, k);
		}
		
		return itr1;
	}
	
	public static void main(String[] args) {
		
		Node n1 = new Node('A');
		Node n2 = new Node('B');
		Node n3 = new Node('A');
		Node n4 = new Node('B');
		Node n5 = new Node('A');

		head = n1;
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		System.out.println("Before removing duplicated:");
		
		for(Node itr = head; itr.next != null; itr=itr.next)
		{
			System.out.println("--"+itr.value);
		}
		
//		removeDuplicate();
//		
//		System.out.println("After removing duplicated:");
//		for(Node itr = head; itr.next != null; itr=itr.next)
//		{
//			System.out.println("--"+itr.value);
//		}
		Node result = getNodeFrom(head,2);
		
		System.out.println("Kth elements is = "+ result.value);
		
	}

}
