package easy;

public class Q108_ConvertSortedArraytoBinarySearchTree {
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
        public TreeNode sortedArrayToBST(int[] nums) {
            return switchToTree(0, nums.length - 1, nums);
        }
        public TreeNode switchToTree(int start, int end, int[] nums){
            int mid = (end + start) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            if(start <= mid -1) root.left = switchToTree(start, mid -1, nums);
            if(mid +1 <= end) root.right = switchToTree(mid + 1, end,  nums);
            return root;
        }
    }
}
