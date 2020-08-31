class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1 and not l2:
            return None

        answer = ListNode(0)
        tmp = answer
        while l1 or l2:
            if l1:
                tmp.val += l1.val
                l1 = l1.next
            if l2:
                tmp.val += l2.val
                l2 = l2.next

            if tmp.val >= 10:
                tmp.next = ListNode(1)
                tmp.val -= 10

            if bool(l1 or l2) and not tmp.next:
                tmp.next = ListNode(0)

            tmp = tmp.next

        return answer
