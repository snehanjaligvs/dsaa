public class CqueueArray {
    static int maxsize = 10;
    static int[]  queue = new int[maxsize];
    static int front = -1;
    static int rear = -1;
    
    public static void enqueue(int i){
        
        if(isFull()){
            System.out.println("queue is full");
        }
        
        else {
            if(front==-1){
            front =0;
            }
            rear = (rear+1)%maxsize;
            queue[rear] = i;
        }
        
    }
    public static void dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else if(front==rear){
            front = rear = -1;
            
        }
        else{
            System.out.println("deleted item : " + queue[front]);
            front = (front+1)%maxsize;
        }
    }
    public static void  display(){
        int i = front;
        while(i!=rear){
            System.out.println("item in queue :" + queue[i]);
            i = (i+1)%maxsize;
        }
        System.out.println("item in queue :" + queue[rear]);
    }
    public static boolean isFull(){
        return ((rear+1)%maxsize) == front;
    }
    public static boolean isEmpty(){
    	 return front == -1 && rear == -1;
    }
    public static void main(String args[]) {
      
      enqueue(5);
      enqueue(10);
       enqueue(12);
      enqueue(54);
      enqueue(16);
      display();
      dequeue();
      dequeue();
      display();
    }
}
 