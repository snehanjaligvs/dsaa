public class LinkedlistStack {
	Node top;
	public LinkedlistStack() {
		top = null;
	}
	public class Node{
		int i;
		Node link;
		
	}
	public void push(int i) {
		Node newNode = new Node();
		newNode.i = i;
		newNode.link = top;
		top = newNode;
	}
	public int peek(){
		if(!isEmpty()) {
			return top.i;
		}
		else
			System.out.println("Stack underflow");
		    return -1;
	}
	public void pop() {
		if(top==null) {
			System.out.println("Stack underflow");
		}
		System.out.println("item popped :" + top.i);
		top = top.link;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public void displayData() {
		if(top == null) {
			System.out.println("underflow");
		}
		else
		{
			Node temp = top;
			while(temp != null ) {
				System.out.println("item in stack :" + temp.i);
				temp = temp.link;
			}
		}
	}

	public static void main(String[] args) {
		
		LinkedlistStack s = new LinkedlistStack();
		s.push(40);
		s.push(1);
		s.push(100);
		s.push(30);
		s.displayData();
		s.pop();
		s.pop();
		s.displayData();

	}

}
