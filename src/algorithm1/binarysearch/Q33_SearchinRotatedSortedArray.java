package algorithm1.binarysearch;

public class Q33_SearchinRotatedSortedArray {
    class Solution {
        int answer = -1;
        public int search(int[] nums, int target) {
            answer = -1;
            search(0, nums.length, nums, target);
            return answer;
        }

        public void search(int start, int end, int[] nums, int target){
            if(start < end){
                int mid = (start + end) / 2;
                if(nums[mid] == target){
                    answer = mid;
                    return;
                }
                if (nums[start] < nums[end - 1]){
                    if(nums[mid] > target){
                        search(start, mid, nums, target);
                    }else{
                        search(mid + 1 , end, nums, target);
                    }
                }else{
                    search(start, mid, nums, target);
                    search(mid + 1 , end, nums, target);
                }
            }
        }
    }
}
