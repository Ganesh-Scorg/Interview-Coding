import java.util.ArrayList;

// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {
	static final int range = 100000;
	int top;
	int stack[] = new int[range];

	ArrayList<Integer> startIndex = new ArrayList<>();

	/**
	 * Constructor to initialize top of stack to -1.
	 */
	public Solution() {
		top = -1;
	}

	/**
	 * This method will push the element to stack.
	 * 
	 * @param value
	 *            : value will be pushed to stack.
	 * 
	 */
	public void push(int value) {

		stack[++top] = value;
	}

	/**
	 * This method will return top element from the stack.
	 * 
	 * @return Returns the top element from the stack.
	 */
	public int top() {

		if (top == -1)
			return 0;

		return stack[top];
	}

	/**
	 * This method will pop the top element from stack.
	 */
	public void pop() {

		if (top == -1)
			return;
		top--;
	}

	/**
	 * Begin Method.
	 */
	public void begin() {
		startIndex.add(top);
	}

	/**
	 * This method will roll-back the current transaction.
	 * 
	 * @return Returns true if transaction can be roll-back else false.
	 */
	public boolean rollback() {

		int lastIndexArrayList;
		if (startIndex.size() != 0) {
			lastIndexArrayList = startIndex.get(startIndex.size() - 1);

			if (lastIndexArrayList == -1)
				return false;

			int count = top;

			for (int i = lastIndexArrayList; i < count; i++) {
				pop();
			}

			startIndex.remove(startIndex.size() - 1);

			return true;
		}
		return false;
	}

	/**
	 * This method will commit the current transaction.
	 * 
	 * @return Returns true if transaction is committed else false.
	 */
	public boolean commit() {

		int lastIndexArrayList;
		if (startIndex.size() != 0) {
			lastIndexArrayList = startIndex.get(startIndex.size() - 1);

			if (lastIndexArrayList == -1)
				return false;

			startIndex.remove(startIndex.size() - 1);

			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.push(1);
		sol.push(2);
		sol.push(4);
		//sol.begin();

		sol.push(7);
		// sol.begin();
		sol.push(15);
		sol.push(20);
		System.out.println(sol.rollback());
		sol.push(25);
		// System.out.println(sol.commit());
		sol.push(30);

		// System.out.println(sol.top());
		// sol.pop();
		System.out.println(sol.top());

		for (int i = 0; i <= sol.top; i++)
			System.out.print(sol.stack[i] + " ");
		// assert sol.top() == 42 : "top() should be 42";
	}
};
