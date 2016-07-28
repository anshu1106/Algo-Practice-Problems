import java.util.*;
public class BracketMatching {
	public static void main(String args[]){
		
		String word = "[(5+4)*{(5/7)-(5+(8/4)}]";
		if(bracketMatching(word)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}

	private static boolean bracketMatching(String word) {
		// TODO Auto-generated method stub
		Stack<String> bracesStack = new Stack<String>();
		
		for(int count=0; count<word.length(); count++){
			if(word.charAt(count) == '{' || word.charAt(count) == '(' || word.charAt(count)=='['){
				bracesStack.push(Character.toString(word.charAt(count)));
			}
			else if (word.charAt(count) == '}' || word.charAt(count) == ')' || word.charAt(count)==']'){
				String popped = bracesStack.peek();
				if ((word.charAt(count) == '}' && popped.charAt(0)=='{') || (word.charAt(count) == ')' && popped.charAt(0)=='(') ||
						(word.charAt(count) == ']' && popped.charAt(0)=='[')){
					bracesStack.pop();
				}
				else {
					return false;
				}
				
			}
		}
		if(bracesStack.isEmpty()){
			return true;
		}
		return false;
	}

}
