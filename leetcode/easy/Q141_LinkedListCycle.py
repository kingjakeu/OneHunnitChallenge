class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        if not head:
            return False

        dict = {head: 0}
        node = head.next
        last = 0
        while node not in dict and node is not None:
            last += 1
            dict[node] = last
            node = node.next

        if node is None:
            return False
        else:
            return True
