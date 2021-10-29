package algorithm1.twopointer;

public class Q19_RemoveNthNodeFromEndofList {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode left = head;
            ListNode right = head;
            int length = 0;

            while (right != null){
                if(length > n) {
                    left = left.next;
                }
                right = right.next;
                length += 1;
            }
            if(length <= n){
                head = head.next;
            }else{
                ListNode temp = left.next;
                left.next = temp == null ? null : temp.next;
            }
            return head;
        }
    }
}
