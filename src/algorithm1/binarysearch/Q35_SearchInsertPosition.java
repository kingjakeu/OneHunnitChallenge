package algorithm1.binarysearch;

public class Q35_SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            return search(0, nums.length, nums, target);
        }
        public int search(int start, int end, int[] nums, int target) {

            if(start >= end){
                return end;
            }

            int mid = (start + end) / 2;

            if(target < nums[mid]) {
                return search(start, mid, nums, target);
            }else {
                return search(mid + 1, end, nums, target);
            }
        }
    }

}
