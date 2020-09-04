# Definition for singly-linked list.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return head
        nodelist = []
        tmp = head
        while tmp:
            nodelist.append(tmp)
            tmp = tmp.next
        if n > len(nodelist):
            n = len(nodelist)

        if n == len(nodelist):
            head = head.next
        elif n == 1:
            nodelist[-n - 1].next = None
        else:
            nodelist[-n - 1].next = nodelist[-n + 1]
        return head