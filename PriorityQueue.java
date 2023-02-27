public class PriorityQueue {
	Node head;
	static class Node{
		int data;
		int priority;
		Node next;
		Node(int i, int p){
			this.data = i;
			this.priority  = p;
			this.next = null;
		}
	}
	static Node delete(Node head) {
		Node temp = head;
		head = head.next;
		return head;
	}
	static Node insert(Node head, int d, int p) {
		Node temp = head;
		Node t = new Node(d, p);
		if ((head).priority > p) { 
			t.next= head; 
		    head = t; 
		  } 
		  else { 
		  
		    while (temp.next != null && 
		      temp.next.priority < p) { 
		      temp = temp.next; 
		    } 
		  
		    t.next = temp.next; 
		    temp.next = t; 
		  } 
		  return head; 
	}
	static boolean isEmpty(Node head) {
		return head==null;
	}
	static int peek(Node head) {
		return head.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node q = new Node(35, 1);
		q =insert(q, 80, 2); 
		q =insert(q, 60, 3); 
		q =insert(q, 20, 0); 
		  
		  while (!isEmpty(q)) { 
		    System.out.println(peek(q)); 
		    q=delete(q); 
		  } 
		  

	}

}
