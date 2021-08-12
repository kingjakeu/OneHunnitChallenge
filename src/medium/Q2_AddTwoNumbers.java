package medium;

public class Q2_AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode node = new ListNode(l1.val + l2.val);
            node.next = getAdd(l1.next, l2.next, node);
            return node;
        }

        ListNode getAdd(ListNode l1, ListNode l2, ListNode prev) {
            ListNode node = new ListNode(0);
            if(prev.val > 9){
                node.val = prev.val / 10;
                prev.val = prev.val % 10;
            }
            if(l1 == null && l2 == null){
                if(node.val > 0) return node;
                return null;
            }

            if(l1 == null) {
                node.val += l2.val;
                node.next = getAdd(l1, l2.next, node);
            }else if(l2 == null){
                node.val += l1.val;
                node.next = getAdd(l1.next, l2, node);
            }else{
                node.val += (l1.val + l2.val);
                node.next = getAdd(l1.next, l2.next, node);
            }
            return node;
        }
    }
}
