package paradigm.linear;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.isEmpty() + " " + stack.size());
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("F");
		
		System.out.println(stack.isEmpty() + " " + stack.size());
		System.out.println(stack.peek() + " " + stack.size());
		System.out.println(stack.pop() + " " + stack.size());
		
		// Stack이 비어있는데도 pop을 하면 Runtime error가 발생하므로 조건을 걸어준다.
		if(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
