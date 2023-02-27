import java.util.*;
class stackOwn  
{  
char a[]=new char[100];  
int top=-1;  
void push(char c)  
{  
	 a[top+1] = c;
     top++;
}  
char pop()  
{  
return a[top--];  
}  
boolean isEmpty()  
{  
return (top==-1)?true:false;  
}  
char peek()  
{  
return a[top];  
}  
}     
public class infixToPostfix  
{  
static stackOwn stack = new stackOwn();         
public static void main(String args[]) 
{  
String infix;  
Scanner sc = new Scanner(System.in);
System.out.println("Enter infix expression");
infix = sc.nextLine();
System.out.println("postfix expression is " + toPostfix(infix));
}  
public static String toPostfix(String infix)  
//converts an infix expression to postfix  
{  
  
String postfix = "";  
for(int i=0;i<infix.length();++i)  
//while there is input to be read  
{  
char x = infix.charAt(i);  
//if it's an operand, add it to the string  
if (Character.isLetter(x))  
postfix = postfix + x;  
else if (x=='(')  
//push (  
{  
stack.push(x);  
}  
else if (x==')')  
//push everything back to (  
{  
while (stack.peek() != '(')  
{  
postfix = postfix + stack.pop();  
}  
stack.pop();        //remove '('  
}  
else  
//print operators occurring before it that have greater precedence  
{  
while (!stack.isEmpty() && !(stack.peek()=='(') && prec(x) <= prec(stack.peek()))  
postfix = postfix + stack.pop();  
stack.push(x);  
}  
}  
while (!stack.isEmpty())  
postfix = postfix + stack.pop();  
return postfix;  
}  
static int prec(char x)  
{  
if (x == '+' || x == '-')  
return 1;  
else if (x == '*' || x == '/' || x == '%')  
return 2;  
else 
	return 0;  
}  
}  