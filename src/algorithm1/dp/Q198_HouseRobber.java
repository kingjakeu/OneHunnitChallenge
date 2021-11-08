package algorithm1.dp;

public class Q198_HouseRobber {
    class Solution {
        public int rob(int[] nums) {
            int length = nums.length;
            int[] cache = new int[length + 1];
            cache[1] = nums[0];
            for (int i = 2; i <= length; i++) {
                cache[i] = Math.max(cache[i-1], cache[i-2] + nums[i-1]);
            }
            return cache[length];
        }
    }
}
