package medium;

import java.util.Deque;
import java.util.LinkedList;

public class Q31_NextPermutation {
    static class Solution {
        public void nextPermutation(int[] nums) {
            int length = nums.length;

            int l = length - 2;
            int r = length - 1;
            while(l < r){
                if(nums[l] < nums[r]){
                    int tmp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = tmp;
                    break;
                }else{
                    l -= 1;
                }
                if(l < 0){
                    r -= 1;
                    l = r - 1;
                }
            }
            for(int i : nums){
                System.out.print(i+" ");
            }
            l += 1;

            System.out.println();
            System.out.println(l +" "+ r);
            while (nums[l] > nums[r] && l < r){
                if(nums[l] > nums[r]){
                    int tmp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = tmp;
                }else{
                    l += 1;
                }
            }
            for(int i : nums){
                System.out.print(i+" ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,3,4,2};
        s.nextPermutation(nums);
    }
}
