import java.util.Stack;

/**
 * Info: Leetcode#155 Min Stack Ref:
 * https://leetcode.com/problems/min-stack/description/
 */
public class Main {

	public static void main(String[] args) {
		 MinStack obj = new MinStack();
		 
		 obj.push(2147483646);
		 obj.push(2147483646);
		 obj.push(2147483647);
		 
		 int param_1 = obj.top();
		 
		 obj.pop();
		 
		 int param_2 = obj.getMin();
		 
		 obj.pop();
		 
		 int param_3 = obj.getMin();
		 
		 obj.pop();
		 
		 obj.push(2147483647);
		 
		 int param_4 = obj.top();
		 
		 int param_5 = obj.getMin();
		 
		 obj.push(-2147483648);
		 
		 int param_6 = obj.top();

		 int param_7 = obj.getMin();
		 
		 obj.pop();
		 
		 int param_8 = obj.getMin();
	}
}


class MinStack {
	
	Stack<Integer> stack;
	int min = Integer.MAX_VALUE;
    
	public MinStack() {
		stack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (min > val) {
			min = val;
		}
		stack.push(min);
	}

	public void pop() {
		stack.pop();
		stack.pop();
	}

	public int top() {
		int j = stack.pop();
		int i = stack.peek();
		stack.push(j);
		return  i;
	}

	public int getMin() {
		return stack.peek();
	}
}