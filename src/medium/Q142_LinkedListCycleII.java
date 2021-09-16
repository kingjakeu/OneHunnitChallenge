package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q142_LinkedListCycleII {
     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            Set<ListNode> nodeSet = new HashSet<>();
            ListNode node = head;
            while(node != null) {
                if(nodeSet.contains(node)){
                    return node;
                }
                nodeSet.add(node);
                node = node.next;

            }
            return null;
        }
    }
}
