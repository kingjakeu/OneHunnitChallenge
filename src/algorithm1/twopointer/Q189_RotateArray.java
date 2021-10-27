package algorithm1.twopointer;

public class Q189_RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            int length = nums.length;
            int modK = k % length;

            int left = 0;
            int right = length - 1;
            swap(nums, left, right);

            left = 0;
            right = modK - 1;
            swap(nums, left, right);

            left = modK;
            right = length - 1;
            swap(nums, left, right);
        }

        public void swap(int[] nums, int left, int right){
            while (left < right){
                int tmp = nums[left];
                nums[left++] = nums[right];
                nums[right--] = tmp;
            }
        }
    }
}
