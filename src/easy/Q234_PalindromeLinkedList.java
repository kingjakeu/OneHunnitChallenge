package easy;

import java.util.ArrayList;
import java.util.List;

public class Q234_PalindromeLinkedList {
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
        public boolean isPalindrome(ListNode head) {
            ListNode node = head;
            int length = 0;
            List<Integer> arr = new ArrayList<>();
            while (node != null){
                arr.add(node.val);
                node = node.next;
                length += 1;
            }
            int mid = length / 2;
            for (int i = 0; i < mid; i++) {
                if(!arr.get(i).equals(arr.get(length-i-1))) return false;
            }
            return true;
        }
    }
}
