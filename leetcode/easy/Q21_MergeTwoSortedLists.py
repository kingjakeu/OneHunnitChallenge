
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        answer = ListNode(0, None)
        self.sort(l1, l2, answer)
        return answer.next

    def sort(self, l1: ListNode, l2: ListNode, answer: ListNode):
        if l1 is None and l2 is None:
            return
        else:
            if l1 is None:
                answer.next = ListNode(l2.val, l2.next)
                return
            elif l2 is None:
                answer.next = ListNode(l1.val, l1.next)
                return
            else:
                if l1.val <= l2.val:
                    answer.next = ListNode(l1.val, None)
                    l1 = l1.next
                else:
                    answer.next = ListNode(l2.val, None)
                    l2 = l2.next
                self.sort(l1, l2, answer.next)