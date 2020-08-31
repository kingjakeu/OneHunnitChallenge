class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if root is None:
            return 0
        if root.left is None and root.right is None:
            return 1
        else:
            max_num = 0
            if root.left is not None:
                max_num = max(self.maxDepth(root.left) + 1, max_num)
            if root.right is not None:
                max_num = max(self.maxDepth(root.right) + 1, max_num)

            return max_num
