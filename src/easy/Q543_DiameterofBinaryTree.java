package easy;

public class Q543_DiameterofBinaryTree {
    class TreeNode {
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
        int max = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            max = 0;
            int left = getLength(root.left);
            int right =  getLength(root.right);
            return Math.max(max, left + right);
        }
        public int getLength(TreeNode node){
            if(node == null) return 0;
            int left = getLength(node.left);
            int right =  getLength(node.right);

            max = Math.max(max, left + right);
            return Math.max(left, right) + 1;
        }
    }
}
