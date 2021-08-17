package medium;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Q31_NextPermutation {
    static class Solution {
        public void nextPermutation(int[] nums) {
            int length = nums.length;
            int i = length - 2;
            while (i >= 0){
                if(nums[i] < nums[i+1]){
                    int m = i+1;
                    for (int j = i+1 ; j < length; j++) {
                        if(nums[j] < nums[m] && nums[i] < nums[j]){
                            m = j;
                        }
                    }
                    int min = nums[m];
                    nums[m] = nums[i];
                    nums[i] = min;

                    Arrays.sort(nums, i+1, length);
                    break;
                }
                i -= 1;
            }
            if(i < 0){
                Arrays.sort(nums);
            }
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4, 1, 3, 2};
        s.nextPermutation(nums);
        for(int n : nums){
            System.out.println(n);
        }
    }
}
