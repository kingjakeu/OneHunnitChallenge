package algorithm1.twopointer;

public class Q977_SquaresofaSortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int length = nums.length;

            int[] answer = new int[length];
            int left;
            int right;
            for (right = 1; right < length; right++) {
                if(nums[right - 1] * nums[right - 1] < nums[right] * nums[right]){
                    break;
                }
            }
            left = right - 1;
            for (int i = 0; i < length; i++) {
                if(left < 0){
                    answer[i] = nums[right] * nums[right];
                    right += 1;
                }else if(right >= length){
                    answer[i] = nums[left] * nums[left];
                    left -= 1;
                }else{
                    int leftSq = nums[left] * nums[left];
                    int rightSq = nums[right] * nums[right];
                    if(leftSq > rightSq){
                        answer[i] = rightSq;
                        right += 1;
                    }else{
                        answer[i] = leftSq;
                        left -= 1;
                    }
                }
            }
            return answer;
        }
    }
}
