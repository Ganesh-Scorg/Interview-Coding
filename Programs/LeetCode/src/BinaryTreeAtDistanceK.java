import java.util.*;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTreeAtDistanceK {
	Node root;
	Map<Node, Node> parent;

	public List<Integer> printkdistanceNode(Node node, Node target, int k) {

		parent = new HashMap<Node, Node>();
		dfs(node, null);
		int currentLevel = 0;

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(target);

		HashSet<Node> hashSet = new HashSet<>();
		hashSet.add(target);

		while (!queue.isEmpty()) {

			if (currentLevel == k) {
				List<Integer> extractedList = new ArrayList();
				for (Node node1 : queue) {
					extractedList.add(node1.data);
				}
				return extractedList;
			}
				
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node temp = queue.remove();
				if (temp.left != null && !hashSet.contains(temp.left)) {
					queue.add(temp.left);
					hashSet.add(temp.left);
				}

				if (temp.right != null && !hashSet.contains(temp.right)) {
					queue.add(temp.right);
					hashSet.add(temp.right);
				}

				Node parentOfCurrentNode = parent.get(temp);
				if (parentOfCurrentNode != null && !hashSet.contains(parentOfCurrentNode)) {
					hashSet.add(parentOfCurrentNode);
					queue.add(parentOfCurrentNode);
				}

			}
			currentLevel++;

		}

		return null;

	}

	public void dfs(Node node, Node par) {
		if (node != null) {
			parent.put(node, par);
			dfs(node.left, node);
			dfs(node.right, node);
		}
	}

	public static void main(String args[]) {
		BinaryTreeAtDistanceK tree = new BinaryTreeAtDistanceK();

		/* Let us construct the tree shown in above diagram */
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		Node target = tree.root.left.right;
		System.out.println(tree.printkdistanceNode(tree.root, target, 2));
	}
}

// This code has been contributed by Mayank Jaiswal
