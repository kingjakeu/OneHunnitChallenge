package easy;

import java.util.HashSet;

public class Q160_IntersectionofTwoLinkedLists {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
    }
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            HashSet<ListNode> nodeHashSet = new HashSet<>();
            while (headA != null){
                nodeHashSet.add(headA);
                headA = headA.next;
            }
            while (headB != null){
                if(nodeHashSet.contains(headB)){
                    return headB;
                }
                headB = headB.next;
            }
            return null;
        }
    }
}
