class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    max_num = 0
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        if not root:
            return 0
        self.find(root, 0)
        return self.max_num

    def find(self, node: TreeNode, idx: int):
        if not node.left and not node.right:
            return idx
        else:
            left, right = 0, 0
            if node.left:
                left = self.find(node.left, idx+1)
            if node.right:
                right = self.find(node.right, idx+1)
            cur_length = left-idx + right-idx
            self.max_num = max(self.max_num, cur_length)
        return max(left, right)
