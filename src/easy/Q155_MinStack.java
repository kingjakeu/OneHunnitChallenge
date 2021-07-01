package easy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Q155_MinStack {
    class MinStack {
        Stack<Integer> stack;
        Integer minVal = null;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if(minVal == null) minVal = val;
            minVal = Math.min(minVal, val);
        }

        public void pop() {
            if(minVal.equals(stack.pop())){
                minVal = null;
                Iterator<Integer> iterator = stack.iterator();
                while (iterator.hasNext()){
                    int element = iterator.next();
                    if(minVal == null) minVal = element;
                    minVal = Math.min(minVal, element);
                }
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minVal;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
