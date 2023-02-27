import java.util.*;
public class BalancingParanthesis {
	
	public static boolean check(String str) {
		 Deque<Character> stack = new ArrayDeque<Character>();
		for(int i=0;i<str.length();i++) {
		char s = str.charAt(i);
		if(s == '(' || s == '{' || s == '[') {
			stack.push(s);
			continue;
		}

		char t;
		switch(s) {
		case '}':
			t = stack.pop();
			if(t == '[' || t == '(') 
				return false;
				break;
			
		case ']':
			t = stack.pop();
			if(t == '{' || t == '(') 
				return false;
				break;
		
		case ')':
			t = stack.pop();
			if(t == '[' || t == '{') 
				return false;
				break;
		}
		}
		
			return stack.isEmpty();
	}
	

	public static void main(String[] args) {
		String str = "{[}";
		if(check(str))
			System.out.println("paranthesis are balanced");
		else
			System.out.println("paranthesis are not balanced");

	}

}
