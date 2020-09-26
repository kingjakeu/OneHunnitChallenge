class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def sortList(self, head: ListNode) -> ListNode:
        if not head:
            return head
        node = head
        arr = []
        while node:
            arr.append(node.val)
            node = node.next
        arr.sort()
        newH = ListNode(arr[0])
        node = newH
        for i in range(1, len(arr)):
            node.next = ListNode(arr[i])
            node = node.next
        return newH