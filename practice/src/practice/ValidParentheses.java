package practice;

import java.util.Stack;

public class ValidParentheses {
	  public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (char c : s.toCharArray()) {
	            // Push opening brackets onto the stack
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } 
	            // Check for closing brackets
	            else if (c == ')' || c == '}' || c == ']') {
	                // Stack must not be empty and the top of the stack must match
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || 
	                    (c == '}' && top != '{') || 
	                    (c == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        
	        // If stack is empty, all parentheses were properly matched
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        String test1 = "()[]{}";
	        String test2 = "([{}])";
	        String test3 = "(]";
	        String test4 = "([)]";
	        
	        System.out.println(isValid(test1)); // true
	        System.out.println(isValid(test2)); // true
	        System.out.println(isValid(test3)); // false
	        System.out.println(isValid(test4)); // false
	    }
	}