package easy;

import java.util.Stack;

public class Q20_ValidParentheses {
    static class Solution {
        public static boolean isValid(String s) {
            Stack<Character> charStack = new Stack<>();
            for(char c : s.toCharArray()){
                if(c == '(' || c == '{' || c == '['){
                    charStack.push(c);
                }else{
                    if(charStack.isEmpty()) return false;
                    char last = charStack.lastElement();
                    if((c == ')' && last == '(')
                        || (c == '}' && last == '{')
                        || (c == ']' && last == '[')){
                        charStack.pop();
                    }else{
                        return false;
                    }
                }
            }
            return charStack.isEmpty();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.isValid("]"));
        System.out.println(Solution.isValid("()[]{}"));
        System.out.println(Solution.isValid("(]"));
        System.out.println(Solution.isValid("([)]"));
        System.out.println(Solution.isValid("{[]}"));
    }
}
