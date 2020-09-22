class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random


class Solution:
    def copyRandomList(self, head: 'Node') -> 'Node':
        node = head
        if not head:
            return None
        arr = []
        while node:
            arr.append(Node(node.val))
            node = node.next

        node = head
        idx = 0
        while node:
            if idx+1 < len(arr):
                arr[idx].next = arr[idx+1]
            if node.random:
                tmp = head
                t = 0
                while tmp:
                    if tmp == node.random:
                        break
                    tmp = tmp.next
                    t += 1
                arr[idx].random = arr[t]
            node = node.next
            idx += 1
        return arr[0]