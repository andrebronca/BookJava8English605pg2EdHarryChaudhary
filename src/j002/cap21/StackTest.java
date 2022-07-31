package j002.cap21;

import java.util.EmptyStackException;
import java.util.Stack;

//example 21.9
public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println("Stack is "+ st);
		System.out.println("30 is at pos "+ st.search(30));
		
		try {
			Integer iObj = st.pop();
			System.out.println("Popped value is "+ iObj.intValue());
			iObj = st.peek();
			System.out.println("Peek value is "+ iObj.intValue());
		} catch (EmptyStackException e) {
			System.out.println(e);
		}
	}
}
