package algorithm1.binarysearch;

/**
 * [EASY]
 */
public class Q704_BinarySearch {

    class Solution {
        public int search(int[] nums, int target) {
            return binarySearch(0, nums.length, nums, target);
        }
        public int binarySearch(int start, int end, int[] nums, int target){
            if(start >= end) return -1;

            int idx = (start + end) / 2;
            if(nums[idx] == target){
                return idx;
            }

            if(target < nums[idx]){
                return binarySearch(start, idx, nums, target);
            }else{
                return binarySearch(idx + 1, end, nums, target);
            }
        }
    }
}
