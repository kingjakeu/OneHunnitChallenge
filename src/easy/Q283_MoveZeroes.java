package easy;

public class Q283_MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                if(nums[i] == 0){
                    for (int j = i+1; j < length; j++) {
                        if (nums[j] != 0){
                            nums[i] = nums[j];
                            nums[j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
}
