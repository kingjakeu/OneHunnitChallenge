package medium;

public class Q114_FlattenBinaryTreetoLinkedList {
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
        public void flatten(TreeNode root) {
            reBalance(root);
        }
        public TreeNode reBalance(TreeNode node){
            if(node == null) return node;
            TreeNode leftEnd = null;
            if(node.left != null){
                leftEnd = reBalance(node.left);
            }
            if(node.right != null){
                reBalance(node.right);
            }
            if(leftEnd != null){
                TreeNode temp = node.right;
                node.right = node.left;
                leftEnd.right = temp;
                node.left = null;
            }
            while (node.right != null){
                node = node.right;
            }
            return node;
        }
    }
}
