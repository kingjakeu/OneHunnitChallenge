package algorithm1.binarysearch;

public class Q162_FindPeakElement {
    class Solution {
        int maxIdx = 0;
        public int findPeakElement(int[] nums) {
            maxIdx = 0;
            find(0, nums.length, nums);
            return maxIdx;
        }

        public void find(int start, int end, int[] nums){
            if(start < end){
                int mid = (start + end) / 2;
                if(nums[maxIdx] < nums[mid]){
                    maxIdx = mid;
                }

                if(mid - 1  >= 0 && nums[mid - 1] > nums[mid]){
                    find(start, mid, nums);
                }
                if(mid + 1 < nums.length && nums[mid + 1] > nums[mid]){
                    find(mid + 1, end, nums);
                }
            }
        }
    }
}
