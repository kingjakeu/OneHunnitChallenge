import sys


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isValidBST(self, root: TreeNode) -> bool:
        if not root:
            return True
        return self.find(root,  -sys.maxsize - 1, sys.maxsize)

    def find(self, node: TreeNode, start: int, end: int) -> bool:
        if node.left is None and node.right is None:
            return True
        answer = True
        if node.left:
            if node.left.val >= node.val or node.left.val <= start:
                return False
            else:
                answer = answer and self.find(node.left, start, min(end, node.val))
        if node.right:
            if node.right.val <= node.val or node.right.val >= end:
                return False
            else:
                answer = answer and self.find(node.right, max(start, node.val), end)
        return answer