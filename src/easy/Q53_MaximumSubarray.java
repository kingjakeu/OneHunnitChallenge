package easy;

public class Q53_MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = nums[0];
            int tempMax = max;
            for (int i = 1; i < nums.length; i++) {
                tempMax = Math.max(tempMax + nums[i], nums[i]);
                max = Math.max(tempMax, max);
            }
            return max;
        }
    }
}
