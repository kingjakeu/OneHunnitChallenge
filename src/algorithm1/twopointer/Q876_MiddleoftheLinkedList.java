package algorithm1.twopointer;

public class Q876_MiddleoftheLinkedList {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        public ListNode middleNode(ListNode head) {
            int length = 0;
            ListNode node = head;
            while (node != null){
                node = node.next;
                length += 1;
            }

            int mid = length / 2;
            node = head;
            for (int i = 0; i < mid; i++) {
                node = node.next;
            }
            return node;
        }
    }
}
