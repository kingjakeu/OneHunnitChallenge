package medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Q98_ValidateBinarySearchTree {
   
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
        List<TreeNode> valList;
        public boolean isValidBST(TreeNode root) {
            valList = new ArrayList<>();
            traverse(root);
            int length = valList.size();
            for (int i = 0; i < length - 1; i++) {
                if(valList.get(i).val >= valList.get(i+1).val) return false;
            }
            return true;
        }
        public void traverse(TreeNode node){
            if(node.left != null) {
                traverse(node.left);
            }
            valList.add(node);
            if(node.right != null){
                traverse(node.right);
            }
        }
    }
}
