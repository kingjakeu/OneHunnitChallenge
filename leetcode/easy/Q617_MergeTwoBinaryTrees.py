class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        if not t1 and not t2:
            return None

        answer = TreeNode()
        que = [answer]
        que_t1 = [t1]
        que_t2 = [t2]
        while que:
            ans_node = que.pop(0)
            t1_node = que_t1.pop(0)
            t2_node = que_t2.pop(0)
            if t1_node:
                ans_node.val += t1_node.val
            if t2_node:
                ans_node.val += t2_node.val

            if (t1_node and t1_node.left) or (t2_node and t2_node.left):
                ans_node.left = TreeNode()
                que.append(ans_node.left)
                if t1_node and t1_node.left:
                    que_t1.append(t1_node.left)
                else:
                    que_t1.append(None)
                if t2_node and t2_node.left:
                    que_t2.append(t2_node.left)
                else:
                    que_t2.append(None)

            if (t1_node and t1_node.right) or (t2_node and t2_node.right):
                ans_node.right = TreeNode()
                que.append(ans_node.right)
                if t1_node and t1_node.right:
                    que_t1.append(t1_node.right)
                else:
                    que_t1.append(None)
                if t2_node and t2_node.right:
                    que_t2.append(t2_node.right)
                else:
                    que_t2.append(None)

        return answer
