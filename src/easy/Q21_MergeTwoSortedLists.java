package easy;

public class Q21_MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode node = new ListNode();
            ListNode root = node;
            while(l1 != null || l2 != null){
                if(l1 == null){
                    node.next = l2;
                    l2 = l2.next;
                }else if(l2 == null){
                    node.next = l1;
                    l1 = l1.next;
                }else{
                    if(l1.val < l2.val){
                        node.next = l1;
                        l1 = l1.next;
                    }else{
                        node.next = l2;
                        l2 = l2.next;
                    }
                }
                node = node.next;
            }
            return root.next;
        }
    }
}
