package medium;

public class Q33_SearchinRotatedSortedArray {
    class Solution {
        public int search(int[] nums, int target) {
            int i = 0;
            for(int n : nums){
                if(n == target){
                    return i;
                }
                i += 1;
            }
            return -1;
        }
    }
}
