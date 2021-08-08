package easy;

import java.util.ArrayList;
import java.util.List;

public class Q94_BinaryTreeInorderTraversal {

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
        List<Integer> answer = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            if(root == null) return answer;
            if(root.left != null){
                inorderTraversal(root.left);
            }
            answer.add(root.val);
            if(root.right != null){
                inorderTraversal(root.right);
            }
            return answer;
        }
    }
}
