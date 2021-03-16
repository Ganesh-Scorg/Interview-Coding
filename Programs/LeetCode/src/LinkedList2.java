// Java program to rearrange link list in place 

// Linked List Class 
public class LinkedList2 { 

	static Node head; // head of the list 


	/* Node Class */
	static class Node { 

		int data; 
		Node next; 

		// Constructor to create a new node 
		Node(int d) { 
			data = d; 
			next = null; 
		} 
	} 

	void printlist(Node node) { 
		if (node == null) { 
			return; 
		} 
		while (node != null) { 
			System.out.print(node.data + " -> "); 
			node = node.next; 
		} 
	} 

	Node reverselist(Node node) { 
		Node prev = null, curr = node, next; 
		while (curr != null) { 
			next = curr.next; 
			curr.next = prev; 
			prev = curr; 
			curr = next; 
		} 
		node = prev; 
		return node; 
	} 

	void rearrange(Node node) {
		
		Node slow_Pointer= node;
		Node fast_Pointer= node.next;
		
		while (fast_Pointer != null && fast_Pointer.next!=null)
		{
			slow_Pointer=slow_Pointer.next;
			fast_Pointer = fast_Pointer.next.next;
			
		}
		Node first = node;
		Node second = slow_Pointer.next;
		slow_Pointer.next=null;
		second = reverselist(second);
		//System.out.println(second.next.data);
		Node res = new Node(0);
		while(first!=null ||second!=null)
		{
			if(first!=null)
			{
				res.next= first;
				res=res.next;
				first=first.next;
			}
			
			if(second!=null)
			{
				res.next=second;
				res=res.next;
				second=second.next;
			}
			
		}
		
		
		printlist(res.next);
		
			
		
		
		
		
	} 

	public static void main(String[] args) { 

		LinkedList2 list = new LinkedList2(); 
		list.head = new Node(1); 
		list.head.next = new Node(2); 
		list.head.next.next = new Node(3); 
		list.head.next.next.next = new Node(4); 
		list.head.next.next.next.next = new Node(5); 
		//list.head.next.next.next.next.next = new Node(6); 

		//list.printlist(head); // print original list 
		list.rearrange(head); // rearrange list as per ques 
		//System.out.println(""); 
		list.printlist(head); // print modified list 

	} 
} 

// This code has been contributed by Mayank Jaiswal 
