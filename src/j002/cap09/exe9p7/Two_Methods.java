package j002.cap09.exe9p7;

public interface Two_Methods {
	void push(int x);
	int pop();
}
class Stack implements Two_Methods{
	int arr[] = new int[5];
	int top = -1;
	
	@Override
	public void push(int x) {
		if(top == 4) {
			System.out.println("overflow");
			return;
		}
		top++;
		arr[top] = x;
	}
	@Override
	public int pop() {
		if(top == -1) {
			System.out.println("Underflow");
			return -1;
		}
		int item = arr[top];
		top--;
		return item;
	}
	void disp() {
		for(int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}

class Stack_Demo{
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.pop();
		for(int i = 0; i < 5; i++) {
			s1.push(i + 100);
		}
//		s1.push(600);
		System.out.println("--Exibir todos os itens --");
		s1.disp();
		System.out.println("--Remover todos os itens --");
		for(int i = 0; i < 5; i++) {
			System.out.println(s1.pop());
		}
		
		Two_Methods t1 = new Stack();
		t1.push(10);
		System.out.println(t1.pop());
		
	}
}