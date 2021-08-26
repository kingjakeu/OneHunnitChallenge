package medium;

public class Q105_ConstructBinaryTreefromPreorderandInorderTraversal {
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
        int[] preorder;
        int[] inorder;
        int poIdx;
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            this.inorder = inorder;
            poIdx = 0;
            TreeNode root = new TreeNode(preorder[poIdx++]);
            int idx;
            int length = inorder.length;
            for (idx = 0; idx < length; idx++) {
                if(root.val == inorder[idx]) break;
            }
            find(0, inorder.length, idx, root);

            return root;
        }
        public void find(int leftStart, int rightEnd, int idx, TreeNode node){
            int leftIdx;
            for (leftIdx = leftStart; leftIdx < idx; leftIdx++) {
                if(preorder[poIdx] == inorder[leftIdx]){
                    node.left = new TreeNode(preorder[poIdx++]);
                    find(leftStart, idx, leftIdx, node.left);
                    break;
                }
            }
            int rightIdx;
            for (rightIdx = idx + 1; rightIdx < rightEnd; rightIdx++) {
                if(preorder[poIdx] == inorder[rightIdx]){
                    node.right = new TreeNode(preorder[poIdx++]);
                    find(idx + 1, rightEnd, rightIdx, node.right);
                    break;
                }
            }
        }
    }
}
