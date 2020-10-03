class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    arr = []
    def kthSmallest(self, root: TreeNode, k: int) -> int:
        self.arr = []
        if not root:
            return -1
        self.find(root)
        return self.arr[k-1]

    def find(self, node: TreeNode):
        if node.left:
            self.find(node.left)
        self.arr.append(node.val)
        if node.right:
            self.find(node.right)