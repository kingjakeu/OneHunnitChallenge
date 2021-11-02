package algorithm1.dfsbfs;

public class Q617_MergeTwoBinaryTrees {
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
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            TreeNode treeNode = null;

            if(root1 != null && root2 != null){
                treeNode = new TreeNode(root1.val + root2.val);
                treeNode.left = mergeTrees(root1.left, root2.left);
                treeNode.right = mergeTrees(root1.right, root2.right);
            }else if(root1 != null){
                treeNode = new TreeNode(root1.val);
                treeNode.left = mergeTrees(root1.left, null);
                treeNode.right = mergeTrees(root1.right, null);
            }else if(root2 != null){
                treeNode = new TreeNode(root2.val);
                treeNode.left = mergeTrees(null, root2.left);
                treeNode.right = mergeTrees(null, root2.right);
            }
            return treeNode;
        }
    }
}
