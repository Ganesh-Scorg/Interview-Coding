import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTree {

	Node root;

	static class Node {
		Node left, right;
		int data;

		public Node(int i) {
			super();
			this.left = null;
			this.right = null;
			this.data = i;
		}

	}

	public static void printLevelOrder(Node root) {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(node.data);

			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}

	}

	public static void zigZag(Node root) {

		Stack<Node> stack = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		boolean right = true;
		stack.add(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.data);
			if (!right) {
				if (node.right != null)
					stack2.add(node.right);
				if (node.left != null)
					stack2.add(node.left);
				
			} else  {
				if (node.left != null)
					stack2.add(node.left);
				if (node.right != null)
					stack2.add(node.right);
				
			}
			
			if(stack.isEmpty())
			{
				right=false;
				
				 Stack<Node> temp = stack; 
			        stack = stack2; 
			        stack2 = temp; 
			}
			

		}

	}

	public static void main(String[] args) {
		ZigZagTree tree = new ZigZagTree();
		tree.root = new Node(1);

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);

		// printLevelOrder(tree.root);
		zigZag(tree.root);
	}

}
