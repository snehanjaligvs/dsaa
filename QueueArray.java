public class QueueArray {
    static int maxsize = 10;
    static int[]  queue = new int[maxsize];
    static int front = 0;
    static int rear = -1;
    static int currentsize =0 ;
    public static void enqueue(int i){
        
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            
            queue[++rear] = i;
            currentsize++;
        }
    }
    public static void dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else if(front==rear){
            front = rear = -1;
            currentsize--;
            System.out.println("deleted item " + queue[front++]);
        }
        else{
            System.out.println("deleted item " + queue[front++]);
            currentsize--;
        }
    }
    public static void  display(){
        int i = front;
        while(i<=rear){
            System.out.println("item in queue :" + queue[i]);
            i++;
        }
        
    }
    public static boolean isFull(){
        return currentsize == maxsize;
    }
    public static boolean isEmpty(){
        return currentsize == 0;
    }
    public static void main(String args[]) {
      enqueue(2);
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
