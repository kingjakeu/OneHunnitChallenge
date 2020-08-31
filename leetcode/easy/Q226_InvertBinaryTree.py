class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        if not root:
            return root
        que = [root]
        while que:
            node = que.pop(0)
            if node.right is not None:
                que.append(node.right)
            if node.left is not None:
                que.append(node.left)
            temp = node.left
            node.left = node.right
            node.right = temp

        return root
