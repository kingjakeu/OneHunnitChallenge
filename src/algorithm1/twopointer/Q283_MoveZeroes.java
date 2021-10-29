package algorithm1.twopointer;

public class Q283_MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int left = 0;
            int right = 1;

            while(left < right && right < nums.length){
                if(nums[left] == 0 && nums[right] > 0){
                    nums[left] = nums[right];
                    nums[right] = 0;
                }else if(nums[left] == 0 && nums[right] == 0){
                    right += 1;
                }else{
                    left +=1;
                    right += 1;
                }
            }
        }
        public void moveZeroes2(int[] nums) {
            int notZeroCount = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != 0){
                    nums[notZeroCount++] = nums[i];
                }
            }
            for (int i = notZeroCount; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
