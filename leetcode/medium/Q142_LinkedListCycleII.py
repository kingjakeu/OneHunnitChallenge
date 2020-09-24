class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        node = head
        visit = []
        while node:
            if node in visit:
                return node
            visit.append(node)
            node = node.next