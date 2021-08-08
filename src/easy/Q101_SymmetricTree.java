package easy;

public class Q101_SymmetricTree {

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
        public boolean isSymmetric(TreeNode root) {
           return isSameTree(root.left, root.right);
        }
        public boolean isSameTree(TreeNode left, TreeNode right){
            if(left == null && right == null) return true;
            if(left == null && right !=null) return false;
            if(left != null && right == null) return false;

            if(left.val == right.val){
                return isSameTree(left.right, right.left) && isSameTree(left.left, right.right);
            }else{
                return false;
            }
        }
    }
}
