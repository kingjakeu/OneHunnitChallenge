class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        temp = head
        nodes = []
        while temp:
            nodes.append(temp)
            temp = temp.next

        length = len(nodes)
        for i in range(length):
            if nodes[i].val != nodes[length-1-i].val:
                return False

        return True