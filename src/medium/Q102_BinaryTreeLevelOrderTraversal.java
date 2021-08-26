package medium;

import java.util.*;

public class Q102_BinaryTreeLevelOrderTraversal {

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
        List<List<Integer>> answer;
        public List<List<Integer>> levelOrder(TreeNode root) {
            answer = new ArrayList<>();
            if(root != null){
                Queue<TreeNode> que = new LinkedList<>();
                que.add(root);
                while (!que.isEmpty()){
                    que = find(que);
                }
            }
            return answer;
        }

        public Queue<TreeNode> find(Queue<TreeNode> que){
            Queue<TreeNode> childQue = new LinkedList<>();
            List<Integer> valList = new ArrayList<>();
            while(!que.isEmpty()){
                TreeNode node = que.poll();
                valList.add(node.val);
                if(node.left != null) childQue.add(node.left);
                if(node.right != null) childQue.add(node.right);
            }
            answer.add(valList);
            return childQue;
        }
    }
}
