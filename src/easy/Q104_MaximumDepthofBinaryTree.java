package easy;

public class Q104_MaximumDepthofBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    class Solution {
        public int maxDepth(TreeNode root) {
            return findDepth(root, 0);
        }

        public int findDepth(TreeNode node, int depth){
            if(node == null) return depth;
            return Math.max(findDepth(node.left, depth + 1), findDepth(node.right, depth + 1));
        }
    }
}
