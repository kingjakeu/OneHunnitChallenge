package algorithm1.binarysearch;

import java.util.Arrays;

public class Q153_FindMinimuminRotatedSortedArray {
    class Solution {
        int minNum;
        public int findMin(int[] nums) {
            minNum = Integer.MAX_VALUE;
            find(0 , nums.length, nums);
            return minNum;
        }
        public void find (int start, int end, int[] nums){
            if(start < end){
                int mid = (start + end) / 2;
                minNum = Math.min(nums[mid], minNum);
                if(mid > 0 && nums[mid] > nums[mid - 1]){
                    find(start, mid, nums);
                }
                if(end > 0 && nums[mid] > nums[end - 1]){
                    find(mid + 1, end, nums);
                }

            }
        }
    }

}
