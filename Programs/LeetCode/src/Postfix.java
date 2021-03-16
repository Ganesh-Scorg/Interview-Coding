

import java.util.Stack;

class Postfix {
	// Method to evaluate value of a postfix expression
	static int evaluatePostfix(String exp) {
		
		Stack<Integer> stack = new Stack<>();
		
		final int Max_value= 1048575;


		String expression[] = exp.split(" ");

		for (int i = 0; i < expression.length; i++) {

			String c = expression[i];
			char temp = c.charAt(0);

			if (Character.isDigit(temp)) {
				stack.push(Integer.parseInt(c));
			} else if (c.equals("DUP")) {

				stack.push(stack.peek());
			} else if (c.equals("POP")) {
				stack.pop();
			} else {
				if (stack.size() >= 2) {
					int val1 = stack.pop();
					int val2 = stack.pop();

					switch (c.charAt(0)) {
					case '+':
						if(val1 > Max_value-val2)
						{
							return -1;
						}else						
						stack.push(val2 + val1);
						break;

					case '-':
						if(val1-val2>=0)
							stack.push(val1 - val2);
						else return -1;
						break;

					case '/':
						stack.push(val2 / val1);
						break;

					case '*':
						stack.push(val2 * val1);
						break;
					}
				}
				else
				{
					return -1;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String exp = "1 2 -";
		System.out.println(evaluatePostfix(exp));
		
	}
}

