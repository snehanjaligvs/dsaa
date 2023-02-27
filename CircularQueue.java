public class CircularQueue {
	
		Node front;
		Node rear;
		public CircularQueue() {
			front = rear = null;
		}
	    public class Node{
	    	int i;
	    	
	    	Node next;
//	    	Node(int i){
//	    		this.i = i;
//	    		
//	    	}
	    	public void displayData() {
	    		System.out.println("item inserted :" + i);
	    	}
	    }
	    public void insert(int i) {
	    	Node newNode = new Node();
	    	if(isEmpty()) {
	    		front = rear = newNode;
	    		newNode.i = i;
	    	}
	    	else {
	    		rear.next = newNode;
	    		newNode.i = i;
	    		rear = newNode;
	    		rear.next = front;
	    	}
	    	newNode.displayData();
	    	
	    }
	    public int delete() {
	    	int temp;
	    	if(front == rear) {
	    	temp = front.i;
	    	front = front.next;
	    	front = rear = null;
	    	}
	    	else {
	    		Node t = front;
	    		temp = t.i;
	    		front = front.next;
	    		rear.next = front;
	    	}
	    	return temp;
	    }
	    public void displayList() {
	    	Node current = front;
	    	while(current.next != front) {
	    		System.out.println("item : " + current.i);
	    		current = current.next;
	    	}
	    	System.out.println("item : " + current.i);
	    }
	    public  boolean isEmpty() {
	    	return front == null;
	    }
	    public static void main(String[] args) {
	    	CircularQueue q = new CircularQueue();
	    	
	    	q.insert(1);
			q.insert(2);
			q.insert(3);
			q.insert(4);
			q.insert(5);
			System.out.println("deleted value is :" + q.delete());
			q.displayList();
	    }

}
