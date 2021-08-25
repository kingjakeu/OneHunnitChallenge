package medium;

public class Q76_SortColors {
     class Solution {
        int length;
        int[] nums;
        public void sortColors(int[] nums) {
            length = nums.length;
            this.nums = new int[length];
            for (int i = 0; i < length; i++) {
                this.nums[i] = nums[i];
            }
            sort(0, length);
            for (int i = 0; i < length; i++) {
                nums[i] = this.nums[i];
            }
        }
        public void sort(int start, int end){
            int mid = (start + end) / 2;
            if(start < mid){
               sort(start, mid);
               sort(mid, end);
               merge(start, mid, end);
           }
        }
        public void merge(int start, int mid, int end){
            int[] tmp = new int[length];
            for (int i = 0; i < length; i++) {
                tmp[i] = nums[i];
            }
            int l = start;
            int r = mid;
            int idx = start;
            while (idx < end){
                if(l >= mid){
                    tmp[idx++] = nums[r++];
                }else if(r >= end){
                    tmp[idx++] = nums[l++];
                }else{
                    if(nums[l] <= nums[r]){
                        tmp[idx++] = nums[l++];
                    }else{
                        tmp[idx++] = nums[r++];
                    }
                }
            }
            nums = tmp;
        }
    }
}
