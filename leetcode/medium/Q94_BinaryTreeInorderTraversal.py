from typing import List
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    answer = []
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        self.answer = []
        if root:
            self.find(root)
        return self.answer

    def find(self, node: TreeNode):
        if node.left is None and node.right is None:
            self.answer.append(node.val)
            return

        if node.left is not None:
            self.find(node.left)
        self.answer.append(node.val)
        if node.right is not None:
            self.find(node.right)
