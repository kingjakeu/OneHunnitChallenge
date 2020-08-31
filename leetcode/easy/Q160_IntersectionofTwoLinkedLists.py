class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        nodes = {}
        temp = headA
        while temp is not None:
            nodes.add(temp)
            temp = temp.next

        temp = headB
        while temp is not None:
            if temp in nodes:
                return temp
            temp = temp.next

        return None

