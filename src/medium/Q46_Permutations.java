package medium;

import javax.management.Query;
import java.util.*;

public class Q46_Permutations {
    static class Solution {
        List<List<Integer>> answer;
        public List<List<Integer>> permute(int[] nums) {
            answer = new ArrayList<>();
            List<Integer> numList = new ArrayList<>();
            for(int n : nums){
                numList.add(n);
            }
            perm(0, nums.length, numList);
            return answer;
        }
        public void perm(int idx, int length, List<Integer> nums){
            if (idx == length){
                answer.add(new ArrayList<>(nums));
            }
            for (int i = idx; i < length; i++) {
                perm(idx + 1, length, nums);
                int temp = nums.remove(idx);
                nums.add(temp);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {1, 2, 3, 4};
        s.permute(num);

    }
}
