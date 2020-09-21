class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def flatten(self, root: TreeNode) -> None:
        if root:
            self.refactor(root)

    def refactor(self, node: TreeNode) -> TreeNode:
        if node.left is None and node.right is None:
            return node

        left, re_left = node.left, node.left
        right = node.right

        if right:
            self.refactor(node.right)

        if left:
            re_left = self.refactor(node.left)
            node.right = left
            re_left.right = right
            node.left = None

        ret = node.right
        while ret.right:
            ret = ret.right
        return ret