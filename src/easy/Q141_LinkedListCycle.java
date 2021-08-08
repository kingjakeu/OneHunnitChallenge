package easy;

import java.util.HashSet;

public class Q141_LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            HashSet<ListNode> nodeSet = new HashSet<>();
            while (head != null){
                if(nodeSet.contains(head)){
                    return true;
                }
                nodeSet.add(head);
                head = head.next;
            }
            return false;
        }
    }
}
