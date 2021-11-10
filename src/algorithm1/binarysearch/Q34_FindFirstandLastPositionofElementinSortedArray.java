package algorithm1.binarysearch;

public class Q34_FindFirstandLastPositionofElementinSortedArray {
    class Solution {
        int[] answer = {-1, -1};
        public int[] searchRange(int[] nums, int target) {
            answer[0] = -1;
            answer[1] = -1;
            find(0, nums.length, nums ,target);
            return answer;
        }

        public void find(int start, int end, int[] nums, int target){
            if(start < end){
                int mid = (start + end) / 2;
                if(nums[mid] == target){
                    System.out.println(mid);
                    answer[0] = answer[0] == - 1 ? mid : Math.min(answer[0], mid);
                    answer[1] = answer[1] == - 1 ? mid : Math.max(answer[1], mid);
                }

                if(nums[mid] >= target){
                    find(start, mid, nums, target);
                }

                if(nums[mid] <= target){
                    find(mid + 1, end, nums, target);
                }
            }
        }
    }
}
