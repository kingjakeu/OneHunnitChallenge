package algorithm1.binarysearch;

public class Q74_Searcha2DMatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int height = matrix.length;
            int h = 0;
            for (int i = 1; i < height; i++) {
                if(matrix[i-1][0] <= target && matrix[i][0] > target){
                    break;
                }
                h = i;
            }
            int width = matrix[h].length;
            return find(0, width, matrix[h], target);
        }

        public boolean find(int start, int end, int[] nums, int target){
            if(start < end){
                int mid = (start + end) / 2;
                if(nums[mid] == target){
                    return true;
                }
                if(nums[mid] > target){
                    return find(start, mid, nums, target);
                }else{
                    return find(mid + 1, end, nums, target);
                }
            }
            return false;
        }
    }
}
