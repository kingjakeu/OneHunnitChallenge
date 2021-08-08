package easy;

public class Q617_MergeTwoBinaryTrees {
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
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            return merge(root1, root2);
        }
        public TreeNode merge(TreeNode x, TreeNode y){
            if(x == null && y == null) return null;
            TreeNode node = new TreeNode();
            if(x == null){
                node.val += y.val;
                node.left = merge(null, y.left);
                node.right = merge(null, y.right);
            }else if(y == null) {
                node.val += x.val;
                node.left = merge(x.left, null);
                node.right = merge(x.right, null);
            }else{
                node.val = y.val + x.val;
                node.left = merge(x.left, y.left);
                node.right = merge(x.right, y.right);
            }
            return node;
        }
    }
}
