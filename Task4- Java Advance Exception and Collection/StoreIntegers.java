package Task4;

import java.util.Iterator;
import java.util.Stack;

public class StoreIntegers {
	public static void main(String arg[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(425);
		stack.push(100);
		stack.push(50);
		stack.push(250);

		Iterator it = stack.iterator();
		while (it.hasNext()) {
			System.out.println("Pushing elements onto the stack: " + it.next());
		}
		stack.pop();
		System.out.println("Popping elements from the Stack: " + stack.pop());

	}
}
