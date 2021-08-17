package medium;

public class Q34_FindFirstandLastPositionofElementinSortedArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] answer = {-1, -1};
            int length = nums.length;
            for (int i = 0; i < length / 2; i++) {
                if(nums[i] == target && answer[0] < 0){
                    answer[0] = i;
                }
                if(nums[(length - 1) - i] == target && answer[1] < 0 ){
                    answer[1] = (length-1)-i;
                }
            }
            if(answer[0] < 0) {
                answer[0] = answer[1];
            }
            if(answer[1] < 0) {
                answer[1] = answer[0];
            }
            return answer;
        }
    }
}
