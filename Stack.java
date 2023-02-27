public class Stack {
	     int size;
	     int[] stack ;
	     int top;
	   
	   public Stack(int s) {
	      size = s;
	      stack = new int[size];
	      top = -1;
	   }
	   public  void push(int j) {
	      stack[top+1] = j;
	      top++;
	   }
	   public  int pop() {
	      return stack[top--];
	   }
	   public   int isEmpty() {
		      if (top == -1) {
		    	  return 1;
		      }
		      else
		    	  return 0;
		   }
		   public   int isFull() {
		      if (top == size - 1) {
		    	  return 1;
		      }
		      else
		    	  return 0;
		   }
		   public static void main(String[] args) {
			   Stack obj = new Stack(8);
		      obj.push(10);
		      obj.push(20);
		      obj.push(30);
		      obj.push(40);
		      obj.push(50);
		      
		      while (obj.isEmpty()==0) {
		         int  value = obj.pop();
		         System.out.println(value);
              }

		   }
		}
              
    
