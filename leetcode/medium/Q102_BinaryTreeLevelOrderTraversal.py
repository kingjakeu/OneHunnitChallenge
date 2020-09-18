from typing import List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        answer = []
        if not root:
            return answer
        que = [root]

        ans = []
        new_que = []
        while que:
            node = que.pop(0)
            ans.append(node.val)
            if node.left:
                new_que.append(node.left)
            if node.right:
                new_que.append(node.right)
            if not que:
                que = new_que.copy()
                new_que = []
                answer.append(ans.copy())
                ans = []
        return answer