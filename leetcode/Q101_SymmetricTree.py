class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        que = [root, root]
        while que:
            node1 = que.pop(0)
            node2 = que.pop(0)
            if node1 is None and node2 is None:
                continue
            if node1 is None or node2 is None:
                return False
            if node1.val != node2.val:
                return False
            que.append(node1.left)
            que.append(node2.right)
            que.append(node1.right)
            que.append(node2.left)
        return True
