class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return head

        nodes = []
        temp = head
        while temp is not None:
            nodes.append(temp)
            temp = temp.next

        nodes.reverse()
        length = len(nodes)
        for i in range(1, length):
            nodes[i-1].next = nodes[i]
        nodes[length-1].next = None
        return nodes[0]
