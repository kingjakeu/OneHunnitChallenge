package medium;

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
            int size = 0;
            ListNode node = head;
            while (node != null){
                size += 1;
                node = node.next;
            }
            int idx = size - n;
            ListNode grandPreNode = null;
            ListNode preNode = null;
            node = head;
            for (int i = 0; i < idx; i++) {
                grandPreNode = preNode;
                preNode = node;
                node = node.next;
            }
            if(grandPreNode == null){
                head = node;
            }else{
                grandPreNode.next = node;
            }
            return head;
        }
    }
}
