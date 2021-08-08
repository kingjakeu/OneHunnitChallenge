package easy;

import java.util.Stack;

public class Q206_ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            Stack<ListNode> stack = new Stack<>();
            ListNode node = head;
            while(node != null){
                stack.push(node);
                node = node.next;
            }

            node = new ListNode();
            head = node;
            while (!stack.isEmpty()){
                node.next = stack.pop();
                node = node.next;
            }
            node.next = null;
            return head.next;
        }
    }
}
