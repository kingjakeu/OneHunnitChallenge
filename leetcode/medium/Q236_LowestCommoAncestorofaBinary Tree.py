# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        return self.find(root, p, q)

    def find(self, node: TreeNode, p: TreeNode, q: TreeNode):
        if node == p or node == q:
            return node

        left, right = None, None
        if node.left:
            left = self.find(node.left, p, q)
        if node.right:
            right = self.find(node.right, p, q)

        if (left == p and right == q) or (left == q and right == p):
            return node

        if not left and not right:
            return None
        if left and not right:
            return left
        if right and not left:
            return right
        return None


