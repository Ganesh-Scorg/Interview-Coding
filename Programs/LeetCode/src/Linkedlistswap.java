
public class Linkedlistswap {
	
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = null;
		}

	}
	 
//	
//	select user ,count(group_id) from
//	user u join record r on 
//	e.user_id = r.user_id join
//	group g on r.group_id=g.group.id
//	group by g.groupid
	
	public Node swap()
	{
		Node node = head;

		
		if(head !=null && head.next!=null)
				return head;
		//1 2 3 4 
		
		Node curr = head.next.next;  //curr = 3
		Node prev = head;	//	prev =1
		head= head.next;	//head = 2
		head.next = prev;	//head.next = 1
		
		
		while(curr !=null && curr.next !=null)
		{
			prev.next=curr.next;   //prev.next = 4
			prev=curr; // prev= 3
			Node temp = curr.next.next; // temp= null
			curr.next.next=temp; //null
			curr=temp; // null
		}
		
		prev.next=curr; // 
		
		
		return head;
		
	}

}
