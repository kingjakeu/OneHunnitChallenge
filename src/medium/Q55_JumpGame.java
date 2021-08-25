package medium;

public class Q55_JumpGame {
    static class Solution {
        public boolean canJump(int[] nums) {
            int length = nums.length;
            int idx = 0;

            while(idx + nums[idx] < length -1){
                int nextIdx = idx;
                int maxJump = 0;
                for (int i = 1; i <= nums[idx] && idx + i < length; i++) {
                    if(maxJump < idx + nums[idx+i] + i){
                        maxJump = idx + nums[idx+i] + i;
                        nextIdx = idx + i;
                    }
                }
                if(nextIdx == idx) return false;
                idx = nextIdx;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 3, 1, 1, 4};
        s.canJump(nums);
    }
}
